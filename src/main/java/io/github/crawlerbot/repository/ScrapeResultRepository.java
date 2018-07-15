package io.github.crawlerbot.repository;

import io.github.crawlerbot.domain.ScrapeResult;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the ScrapeResult entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ScrapeResultRepository extends MongoRepository<ScrapeResult, String> {

}
