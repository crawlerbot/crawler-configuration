package io.github.crawlerbot.repository;

import io.github.crawlerbot.domain.Scrape;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the Scrape entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ScrapeRepository extends MongoRepository<Scrape, String> {


}
