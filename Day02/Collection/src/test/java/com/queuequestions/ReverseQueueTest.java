package com.queueoperations;

import com.queuequestions.ReverseQueue;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.Queue;
import static org.junit.jupiter.api.Assertions.*;

class ReverseQueueTest {

    @Test
    void testReverseQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        Queue<Integer> expectedReversedQueue = new LinkedList<>();
        expectedReversedQueue.offer(30);
        expectedReversedQueue.offer(20);
        expectedReversedQueue.offer(10);

        Queue<Integer> actualReversedQueue = ReverseQueue.reverseQueue(queue);

        assertEquals(expectedReversedQueue, actualReversedQueue);
    }
}