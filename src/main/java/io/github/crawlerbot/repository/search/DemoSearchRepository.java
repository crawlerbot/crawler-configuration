package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.Demo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Demo entity.
 */
public interface DemoSearchRepository extends ElasticsearchRepository<Demo, String> {
}
