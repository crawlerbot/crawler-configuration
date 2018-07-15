package io.github.crawlerbot.repository;

import io.github.crawlerbot.domain.ScrapeData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the ScrapeData entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ScrapeDataRepository extends MongoRepository<ScrapeData, String> {

}
