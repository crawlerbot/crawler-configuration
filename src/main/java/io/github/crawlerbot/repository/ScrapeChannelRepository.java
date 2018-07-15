package io.github.crawlerbot.repository;

import io.github.crawlerbot.domain.ScrapeChannel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the ScrapeChannel entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ScrapeChannelRepository extends MongoRepository<ScrapeChannel, String> {



}
