package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.History;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the History entity.
 */
public interface HistorySearchRepository extends ElasticsearchRepository<History, String> {
}
