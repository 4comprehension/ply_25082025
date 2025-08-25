package com.example.domain.hello;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

class InMemoryMessageRepository implements MessageRepository {

    private final Map<String, String> messages = new ConcurrentHashMap<>();

    @Override
    public Optional<String> getMessage(String messageId) {
        return Optional.ofNullable(messages.get(messageId));
    }

    @Override
    public void putMessage(String messageId, String message) {
        messages.put(messageId, message);
    }
}
