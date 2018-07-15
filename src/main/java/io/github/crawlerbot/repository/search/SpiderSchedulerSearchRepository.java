package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.SpiderScheduler;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the SpiderScheduler entity.
 */
public interface SpiderSchedulerSearchRepository extends ElasticsearchRepository<SpiderScheduler, String> {
}
