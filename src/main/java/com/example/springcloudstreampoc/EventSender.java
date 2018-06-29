package com.example.springcloudstreampoc;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class EventSender {

    EventsPublisher eventsPublisher;

    void sendEvent(Event event) {
        log.info("Sending event : {}", event.getId());
        eventsPublisher.events().send(MessageBuilder.withPayload(event).build());
        log.info("Sent event: {}", event.getId());
    }
}
