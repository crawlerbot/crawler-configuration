package io.github.crawlerbot.service.impl;

import io.github.crawlerbot.service.HistoryService;
import io.github.crawlerbot.domain.History;
import io.github.crawlerbot.repository.HistoryRepository;
import io.github.crawlerbot.repository.search.HistorySearchRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing History.
 */
@Service
public class HistoryServiceImpl implements HistoryService {

    private final Logger log = LoggerFactory.getLogger(HistoryServiceImpl.class);

    private final HistoryRepository historyRepository;

    private final HistorySearchRepository historySearchRepository;

    public HistoryServiceImpl(HistoryRepository historyRepository, HistorySearchRepository historySearchRepository) {
        this.historyRepository = historyRepository;
        this.historySearchRepository = historySearchRepository;
    }

    /**
     * Save a history.
     *
     * @param history the entity to save
     * @return the persisted entity
     */
    @Override
    public History save(History history) {
        log.debug("Request to save History : {}", history);        History result = historyRepository.save(history);
        historySearchRepository.save(result);
        return result;
    }

    /**
     * Get all the histories.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    public Page<History> findAll(Pageable pageable) {
        log.debug("Request to get all Histories");
        return historyRepository.findAll(pageable);
    }


    /**
     * Get one history by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    public Optional<History> findOne(String id) {
        log.debug("Request to get History : {}", id);
        return historyRepository.findById(id);
    }

    /**
     * Delete the history by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(String id) {
        log.debug("Request to delete History : {}", id);
        historyRepository.deleteById(id);
        historySearchRepository.deleteById(id);
    }

    /**
     * Search for the history corresponding to the query.
     *
     * @param query the query of the search
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    public Page<History> search(String query, Pageable pageable) {
        log.debug("Request to search for a page of Histories for query {}", query);
        return historySearchRepository.search(queryStringQuery(query), pageable);    }
}
