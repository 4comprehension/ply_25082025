package com.example.example.web;

import com.example.example.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/hello")
    public MessageResponse hello() {
        return new MessageResponse(helloWorldService.getMessage());
    }

    @GetMapping("/hello/{name}")
    public MessageResponse helloByName(@PathVariable String name) {
        return new MessageResponse(helloWorldService.getMessage(name));
    }

    public record MessageResponse(String message) {
    }
}
