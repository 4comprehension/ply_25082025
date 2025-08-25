package com.example.domain.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ExampleConfiguration {

    @Bean
    public HelloWorldFacade helloWorldService(@Value("${hello.world.name}") String name) {
        return new HelloWorldFacade(name);
    }
}
