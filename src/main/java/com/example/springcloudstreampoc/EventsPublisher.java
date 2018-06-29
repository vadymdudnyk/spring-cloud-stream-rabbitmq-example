package com.example.springcloudstreampoc;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface EventsPublisher {
    String EVENT = "events";

    @Output(EventsPublisher.EVENT)
    MessageChannel events();
}
