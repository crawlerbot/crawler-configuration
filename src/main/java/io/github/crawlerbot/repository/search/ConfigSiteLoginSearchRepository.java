package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.ConfigSiteLogin;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the ConfigSiteLogin entity.
 */
public interface ConfigSiteLoginSearchRepository extends ElasticsearchRepository<ConfigSiteLogin, String> {
}
