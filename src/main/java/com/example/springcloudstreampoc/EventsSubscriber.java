package com.example.springcloudstreampoc;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface EventsSubscriber {

    String EVENTS = "events-subscriber";

    @Input(EventsSubscriber.EVENTS)
    SubscribableChannel eventsSubscriber();
}
