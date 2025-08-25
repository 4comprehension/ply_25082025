package com.example.domain.hello;

public class HelloWorldFacade {

    private final MessageRepository messageRepository;

    HelloWorldFacade(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public String getMessage(String messageKey) {
        return messageRepository.getMessage(messageKey).orElseThrow();
    }


    public void saveMessage(String messageKey, String message) {
        messageRepository.putMessage(messageKey, message);
    }
}
