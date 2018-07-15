package io.github.crawlerbot.web.rest;

import io.github.crawlerbot.CrawlerConfigurationApp;

import io.github.crawlerbot.domain.History;
import io.github.crawlerbot.repository.HistoryRepository;
import io.github.crawlerbot.repository.search.HistorySearchRepository;
import io.github.crawlerbot.service.HistoryService;
import io.github.crawlerbot.web.rest.errors.ExceptionTranslator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.List;


import static io.github.crawlerbot.web.rest.TestUtil.createFormattingConversionService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.elasticsearch.index.query.QueryBuilders.queryStringQuery;
import static org.hamcrest.Matchers.hasItem;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the HistoryResource REST controller.
 *
 * @see HistoryResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CrawlerConfigurationApp.class)
public class HistoryResourceIntTest {

    private static final String DEFAULT_NAME = "AAAAAAAAAA";
    private static final String UPDATED_NAME = "BBBBBBBBBB";

    @Autowired
    private HistoryRepository historyRepository;

    

    @Autowired
    private HistoryService historyService;

    /**
     * This repository is mocked in the io.github.crawlerbot.repository.search test package.
     *
     * @see io.github.crawlerbot.repository.search.HistorySearchRepositoryMockConfiguration
     */
    @Autowired
    private HistorySearchRepository mockHistorySearchRepository;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    private MockMvc restHistoryMockMvc;

    private History history;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final HistoryResource historyResource = new HistoryResource(historyService);
        this.restHistoryMockMvc = MockMvcBuilders.standaloneSetup(historyResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static History createEntity() {
        History history = new History()
            .name(DEFAULT_NAME);
        return history;
    }

    @Before
    public void initTest() {
        historyRepository.deleteAll();
        history = createEntity();
    }

    @Test
    public void createHistory() throws Exception {
        int databaseSizeBeforeCreate = historyRepository.findAll().size();

        // Create the History
        restHistoryMockMvc.perform(post("/api/histories")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(history)))
            .andExpect(status().isCreated());

        // Validate the History in the database
        List<History> historyList = historyRepository.findAll();
        assertThat(historyList).hasSize(databaseSizeBeforeCreate + 1);
        History testHistory = historyList.get(historyList.size() - 1);
        assertThat(testHistory.getName()).isEqualTo(DEFAULT_NAME);

        // Validate the History in Elasticsearch
        verify(mockHistorySearchRepository, times(1)).save(testHistory);
    }

    @Test
    public void createHistoryWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = historyRepository.findAll().size();

        // Create the History with an existing ID
        history.setId("existing_id");

        // An entity with an existing ID cannot be created, so this API call must fail
        restHistoryMockMvc.perform(post("/api/histories")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(history)))
            .andExpect(status().isBadRequest());

        // Validate the History in the database
        List<History> historyList = historyRepository.findAll();
        assertThat(historyList).hasSize(databaseSizeBeforeCreate);

        // Validate the History in Elasticsearch
        verify(mockHistorySearchRepository, times(0)).save(history);
    }

    @Test
    public void getAllHistories() throws Exception {
        // Initialize the database
        historyRepository.save(history);

        // Get all the historyList
        restHistoryMockMvc.perform(get("/api/histories?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(history.getId())))
            .andExpect(jsonPath("$.[*].name").value(hasItem(DEFAULT_NAME.toString())));
    }
    

    @Test
    public void getHistory() throws Exception {
        // Initialize the database
        historyRepository.save(history);

        // Get the history
        restHistoryMockMvc.perform(get("/api/histories/{id}", history.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(history.getId()))
            .andExpect(jsonPath("$.name").value(DEFAULT_NAME.toString()));
    }
    @Test
    public void getNonExistingHistory() throws Exception {
        // Get the history
        restHistoryMockMvc.perform(get("/api/histories/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    public void updateHistory() throws Exception {
        // Initialize the database
        historyService.save(history);
        // As the test used the service layer, reset the Elasticsearch mock repository
        reset(mockHistorySearchRepository);

        int databaseSizeBeforeUpdate = historyRepository.findAll().size();

        // Update the history
        History updatedHistory = historyRepository.findById(history.getId()).get();
        updatedHistory
            .name(UPDATED_NAME);

        restHistoryMockMvc.perform(put("/api/histories")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(updatedHistory)))
            .andExpect(status().isOk());

        // Validate the History in the database
        List<History> historyList = historyRepository.findAll();
        assertThat(historyList).hasSize(databaseSizeBeforeUpdate);
        History testHistory = historyList.get(historyList.size() - 1);
        assertThat(testHistory.getName()).isEqualTo(UPDATED_NAME);

        // Validate the History in Elasticsearch
        verify(mockHistorySearchRepository, times(1)).save(testHistory);
    }

    @Test
    public void updateNonExistingHistory() throws Exception {
        int databaseSizeBeforeUpdate = historyRepository.findAll().size();

        // Create the History

        // If the entity doesn't have an ID, it will be created instead of just being updated
        restHistoryMockMvc.perform(put("/api/histories")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(history)))
            .andExpect(status().isBadRequest());

        // Validate the History in the database
        List<History> historyList = historyRepository.findAll();
        assertThat(historyList).hasSize(databaseSizeBeforeUpdate);

        // Validate the History in Elasticsearch
        verify(mockHistorySearchRepository, times(0)).save(history);
    }

    @Test
    public void deleteHistory() throws Exception {
        // Initialize the database
        historyService.save(history);

        int databaseSizeBeforeDelete = historyRepository.findAll().size();

        // Get the history
        restHistoryMockMvc.perform(delete("/api/histories/{id}", history.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<History> historyList = historyRepository.findAll();
        assertThat(historyList).hasSize(databaseSizeBeforeDelete - 1);

        // Validate the History in Elasticsearch
        verify(mockHistorySearchRepository, times(1)).deleteById(history.getId());
    }

    @Test
    public void searchHistory() throws Exception {
        // Initialize the database
        historyService.save(history);
        when(mockHistorySearchRepository.search(queryStringQuery("id:" + history.getId()), PageRequest.of(0, 20)))
            .thenReturn(new PageImpl<>(Collections.singletonList(history), PageRequest.of(0, 1), 1));
        // Search the history
        restHistoryMockMvc.perform(get("/api/_search/histories?query=id:" + history.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(history.getId())))
            .andExpect(jsonPath("$.[*].name").value(hasItem(DEFAULT_NAME.toString())));
    }

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(History.class);
        History history1 = new History();
        history1.setId("id1");
        History history2 = new History();
        history2.setId(history1.getId());
        assertThat(history1).isEqualTo(history2);
        history2.setId("id2");
        assertThat(history1).isNotEqualTo(history2);
        history1.setId(null);
        assertThat(history1).isNotEqualTo(history2);
    }
}
