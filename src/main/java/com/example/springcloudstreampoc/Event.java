package com.example.springcloudstreampoc;

import lombok.Data;

@Data
public class Event {
    private Long id;

    public Event(Long id) {
        this.id = id;
    }
}
