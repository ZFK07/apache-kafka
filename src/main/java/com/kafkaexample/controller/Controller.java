package com.kafkaexample.controller;

import com.kafkaexample.entity.MessageRequest;
import lombok.AllArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("api/alpha")
@AllArgsConstructor
public class Controller {

    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody MessageRequest message){
        kafkaTemplate.send("amigoscode",message.getMessage());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
