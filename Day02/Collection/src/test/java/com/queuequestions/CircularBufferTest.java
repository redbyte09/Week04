package com.queuequestions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircularBufferTest {
    private CircularBuffer cb;

    @BeforeEach
    void setUp() {
        cb = new CircularBuffer(3); // Initialize buffer with size 3 before each test
    }

    @Test
    void testInsertionAndRetrieval() {
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        assertArrayEquals(new int[]{1, 2, 3}, cb.getBufferContents(), "Buffer should contain [1, 2, 3]");
    }

    @Test
    void testOverwriteOldestElement() {
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4); // Should overwrite 1
        assertArrayEquals(new int[]{2, 3, 4}, cb.getBufferContents(), "Buffer should contain [2, 3, 4]");
    }
}
