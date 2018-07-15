package io.github.crawlerbot.repository;

import io.github.crawlerbot.domain.ConfigGroup;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the ConfigGroup entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConfigGroupRepository extends MongoRepository<ConfigGroup, String> {



}
