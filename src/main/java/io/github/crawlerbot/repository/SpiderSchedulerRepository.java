package io.github.crawlerbot.repository;

import io.github.crawlerbot.domain.SpiderScheduler;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the SpiderScheduler entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SpiderSchedulerRepository extends MongoRepository<SpiderScheduler, String> {

}
