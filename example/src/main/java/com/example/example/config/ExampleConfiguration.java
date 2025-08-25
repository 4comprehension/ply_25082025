package com.example.example.config;

import com.example.example.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfiguration {

    @Bean
    public HelloWorldService helloWorldService(@Value("${hello.world.name}") String name) {
        return new HelloWorldService(name);
    }
}
