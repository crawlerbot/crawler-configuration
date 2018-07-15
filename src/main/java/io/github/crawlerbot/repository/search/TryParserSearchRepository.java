package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.TryParser;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the TryParser entity.
 */
public interface TryParserSearchRepository extends ElasticsearchRepository<TryParser, String> {
}
