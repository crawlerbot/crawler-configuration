package io.github.crawlerbot.repository;

import io.github.crawlerbot.domain.Channel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the Channel entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ChannelRepository extends MongoRepository<Channel, String> {


}
