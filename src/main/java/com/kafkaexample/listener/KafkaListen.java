package com.kafkaexample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListen {

  @KafkaListener(topics = "amigoscode", groupId = "groupId")
  void listener(String data) {
    System.out.println(data);
  }
}
