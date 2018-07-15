package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.Scrape;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Scrape entity.
 */
public interface ScrapeSearchRepository extends ElasticsearchRepository<Scrape, String> {
}
