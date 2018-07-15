package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.SiteChannel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the SiteChannel entity.
 */
public interface SiteChannelSearchRepository extends ElasticsearchRepository<SiteChannel, String> {
}
