package com.example.domain.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ExampleConfiguration {

    @Bean
    public PostgresMessageRepository postgresMessageRepository() {
        return new PostgresMessageRepository();
    }

    @Bean
    public HelloWorldFacade helloWorldService(MessageRepository messageRepository) {
        return new HelloWorldFacade(messageRepository);
    }
}
