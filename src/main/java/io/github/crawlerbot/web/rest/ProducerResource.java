package io.github.crawlerbot.web.rest;

import com.codahale.metrics.annotation.Timed;
import io.github.crawlerbot.messaging.Greeting;
import io.github.crawlerbot.messaging.ProducerChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProducerResource{

    private final Logger log = LoggerFactory.getLogger(ProducerResource.class);
    private MessageChannel channel;

    public ProducerResource(ProducerChannel channel) {
        this.channel = channel.messageChannel();
    }

    @GetMapping("/greetings/{count}")
    @Timed
    public void produce(@PathVariable int count) {
        log.info("start send message");
        while(count > 0) {
            log.info("start send message");
            try {
                log.info("start sending..............");

                channel.send(MessageBuilder.withPayload(new Greeting().setMessage("Hello world!: " + count)).build());
            } catch (Exception ex) {
                log.info("Error sending message: {}", ex.toString());
            }
            count--;
        }
    }

}
