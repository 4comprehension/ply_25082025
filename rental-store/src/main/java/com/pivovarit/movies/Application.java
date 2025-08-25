package com.pivovarit.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// REST API: GET /movies/{id}
// 1. Wstrzyknąć MovieRepository do MovieService i dokończyć implementację
// 2. Stworzyć MovieController, wstrzyknąć tam MovieService i wystawić API

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
