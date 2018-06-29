package com.example.springcloudstreampoc;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {

    private EventSender eventSender;

    @PostMapping("/events/{id}")
    public void sendEvent(@PathVariable Long id) {
        eventSender.sendEvent(new Event(id));
    }
}
