package io.github.crawlerbot.repository;

import io.github.crawlerbot.domain.SiteChannel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the SiteChannel entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SiteChannelRepository extends MongoRepository<SiteChannel, String> {


}
