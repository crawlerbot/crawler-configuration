package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.ScrapeResult;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the ScrapeResult entity.
 */
public interface ScrapeResultSearchRepository extends ElasticsearchRepository<ScrapeResult, String> {
}
