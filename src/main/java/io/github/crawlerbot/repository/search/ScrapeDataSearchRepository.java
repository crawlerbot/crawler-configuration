package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.ScrapeData;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the ScrapeData entity.
 */
public interface ScrapeDataSearchRepository extends ElasticsearchRepository<ScrapeData, String> {
}
