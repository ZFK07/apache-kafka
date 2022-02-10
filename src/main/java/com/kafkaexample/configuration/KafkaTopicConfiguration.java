package com.kafkaexample.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic amigosCodeTopic(){
        return TopicBuilder.name("amigoscode").build();
    }


}
