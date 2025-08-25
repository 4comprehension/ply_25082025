package com.example.example;

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
    public static class Runner implements CommandLineRunner {

        private final HelloWorldService helloWorldService;

        Runner(HelloWorldService helloWorldService) {
            this.helloWorldService = helloWorldService;
        }

        @Override
        public void run(String... args) {
            System.out.println("[CommandLineRunner] Starting...");
            helloWorldService.hello();
        }
    }
}
