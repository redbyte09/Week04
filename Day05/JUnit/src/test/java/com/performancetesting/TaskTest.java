package com.performancetesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    private final Task task = new Task();

    @Test
    void testLongRunningTask() {
        assertTimeout(Duration.ofSeconds(2), () -> {
            String result = task.longRunningTask();
            assertEquals("Task Completed", result);
        });
    }
}


