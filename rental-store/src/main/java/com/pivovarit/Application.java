package com.pivovarit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 1 rozbudować RentalFacade#findById/findByTitle: zwracanie dodatkowo opisu filmu
// 2 dodać interface DescriptionsRepository#findById
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
