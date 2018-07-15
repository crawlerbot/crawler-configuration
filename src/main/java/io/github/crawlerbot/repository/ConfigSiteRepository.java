package io.github.crawlerbot.repository;

import io.github.crawlerbot.domain.ConfigSite;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the ConfigSite entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConfigSiteRepository extends MongoRepository<ConfigSite, String> {



}
