package com.amigoscode;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "burmincode", groupId = "groupId", containerFactory = "messageFactory")
    void listener(Message data){
        System.out.println("Listener recieved: " + data);
    }
}
