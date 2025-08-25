package com.example.web;

import com.example.domain.hello.HelloWorldFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final HelloWorldFacade helloWorldFacade;

    HelloWorldController(HelloWorldFacade helloWorldFacade) {
        this.helloWorldFacade = helloWorldFacade;
    }

    @GetMapping("/hello")
    public MessageResponse hello() {
        return new MessageResponse(helloWorldFacade.getMessage());
    }

    @GetMapping("/hello/{name}")
    public MessageResponse helloByName(@PathVariable String name) {
        return new MessageResponse(helloWorldFacade.getMessage(name));
    }

    public record MessageResponse(String message) {
    }
}
