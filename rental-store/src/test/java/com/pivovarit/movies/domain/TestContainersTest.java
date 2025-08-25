package com.pivovarit.movies.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class TestContainersTest {

    @Test
    void testDockerIsWorkingWithBusyBox() throws Exception {
        try (GenericContainer<?> busybox = new GenericContainer<>(DockerImageName.parse("busybox:1.36"))
          .withCommand("sleep", "5")) { // keep container alive briefly
            busybox.start();

            String output = busybox
              .execInContainer("echo", "hello-busybox")
              .getStdout()
              .trim();

            assertEquals("hello-busybox", output);
        }
    }
}
