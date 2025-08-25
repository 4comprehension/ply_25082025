package com.example;

import com.example.domain.hello.HelloWorldFacade;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

    @Component
    public record Runner(HelloWorldFacade helloWorldFacade) implements CommandLineRunner {

        @Override
        public void run(String... args) {
            System.out.println("[CommandLineRunner] Starting...");

            helloWorldFacade.saveMessage("message.hello", "Hello World!");
        }
    }
}
