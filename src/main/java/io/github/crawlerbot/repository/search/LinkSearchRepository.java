package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.Link;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Link entity.
 */
public interface LinkSearchRepository extends ElasticsearchRepository<Link, String> {
}
