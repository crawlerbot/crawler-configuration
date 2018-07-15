package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.ChannelOuterLink;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the ChannelOuterLink entity.
 */
public interface ChannelOuterLinkSearchRepository extends ElasticsearchRepository<ChannelOuterLink, String> {
}
