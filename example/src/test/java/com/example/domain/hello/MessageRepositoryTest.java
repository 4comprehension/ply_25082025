package com.example.domain.hello;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

abstract class MessageRepositoryTest {

    abstract MessageRepository instance();

    @Test
    void shouldSave() {
        var instance = instance();

        instance.putMessage("foo", "bar");
        assertThat(instance.getMessage("foo")).contains("bar");
    }

    public static class InMemoryMessageRepositoryTest extends MessageRepositoryTest {

        @Override
        MessageRepository instance() {
            return new InMemoryMessageRepository();
        }
    }

    public static class PostgresMessageRepositoryTest extends MessageRepositoryTest {

        @Override
        MessageRepository instance() {
            return new PostgresMessageRepository();
        }
    }
}
