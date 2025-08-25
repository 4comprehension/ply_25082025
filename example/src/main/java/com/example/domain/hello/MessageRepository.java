package com.example.domain.hello;

import java.util.Optional;

interface MessageRepository {
    Optional<String> getMessage(String messageId);

    void putMessage(String messageId, String message);
}
