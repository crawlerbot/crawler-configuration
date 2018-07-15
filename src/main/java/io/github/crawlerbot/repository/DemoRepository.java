package io.github.crawlerbot.repository;

import io.github.crawlerbot.domain.Demo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the Demo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DemoRepository extends MongoRepository<Demo, String> {

}
