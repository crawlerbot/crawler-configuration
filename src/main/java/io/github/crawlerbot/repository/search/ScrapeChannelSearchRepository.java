package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.ScrapeChannel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the ScrapeChannel entity.
 */
public interface ScrapeChannelSearchRepository extends ElasticsearchRepository<ScrapeChannel, String> {
}
