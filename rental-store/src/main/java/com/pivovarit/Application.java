package com.pivovarit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 1. make rentals hexagonal
// 2. MovieRepository -> interface
// 3. Existing fake movie repository replaced with hashmap-based implementation
// 4. write save/get movie unit test
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
