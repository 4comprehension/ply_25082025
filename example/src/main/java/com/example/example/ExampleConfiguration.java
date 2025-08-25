package com.example.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ExampleConfiguration {

    @Bean
    public HelloWorldService helloWorldService(@Value("${hello.world.name}") String name) {
        return new HelloWorldService(name);
    }
}
