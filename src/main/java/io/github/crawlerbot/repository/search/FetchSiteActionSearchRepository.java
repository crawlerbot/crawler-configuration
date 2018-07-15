package io.github.crawlerbot.repository.search;

import io.github.crawlerbot.domain.FetchSiteAction;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the FetchSiteAction entity.
 */
public interface FetchSiteActionSearchRepository extends ElasticsearchRepository<FetchSiteAction, String> {
}
