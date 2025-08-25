package com.example.example;

class HelloWorldService {

    private final String name;

    HelloWorldService(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.printf(getMessage());
    }

    public String getMessage() {
        return String.format("Hello, %s!%n", name);
    }

    public String getMessage(String name) {
        return String.format("Hello, %s!%n", name);
    }
}
