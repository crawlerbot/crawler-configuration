package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.ConfigMapping;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the ConfigMapping entity.
 */
public interface ConfigMappingSearchRepository extends ElasticsearchRepository<ConfigMapping, String> {
}
