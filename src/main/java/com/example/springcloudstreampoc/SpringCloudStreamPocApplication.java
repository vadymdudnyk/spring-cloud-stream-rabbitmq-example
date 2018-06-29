package com.example.springcloudstreampoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(value = {EventsPublisher.class, EventsSubscriber.class})
public class SpringCloudStreamPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStreamPocApplication.class, args);
    }

}
