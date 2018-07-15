package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.ConfigGroup;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the ConfigGroup entity.
 */
public interface ConfigGroupSearchRepository extends ElasticsearchRepository<ConfigGroup, String> {
}
