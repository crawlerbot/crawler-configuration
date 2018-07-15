package io.github.crawlerbot.repository;

import io.github.crawlerbot.domain.ConfigSiteLogin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the ConfigSiteLogin entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConfigSiteLoginRepository extends MongoRepository<ConfigSiteLogin, String> {

}
