package com.example.domain.hello;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloWorldFacadeTest {

    @RepeatedTest(1_000)
    void shouldSaveMessage() {
        var facade = new HelloWorldFacade(new InMemoryMessageRepository());


        facade.saveMessage("foo", "bar");

        assertThat(facade.getMessage("foo")).isEqualTo("bar");
    }
}
