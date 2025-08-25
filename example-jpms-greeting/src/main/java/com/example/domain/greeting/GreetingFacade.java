package com.example.domain.greeting;

import com.example.domain.hello.HelloWorldFacade;

public class GreetingFacade {

    private final HelloWorldFacade helloWorldFacade;

    GreetingFacade(HelloWorldFacade helloWorldFacade) {
        this.helloWorldFacade = helloWorldFacade;
    }
}
