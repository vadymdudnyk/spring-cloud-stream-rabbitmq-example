package com.example.springcloudstreampoc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EventListener {

    @StreamListener(EventsSubscriber.EVENTS)
    public void handle(Event event) {
        log.info("Retrieved event in first handler : {}", event.getId());
    }

    @StreamListener(EventsSubscriber.EVENTS)
    public void handle2(Event event) {
        log.info("Retrieved event in second handler: {}", event.getId());
    }
}
