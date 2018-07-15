package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.Channel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Channel entity.
 */
public interface ChannelSearchRepository extends ElasticsearchRepository<Channel, String> {
}
