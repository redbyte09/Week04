package com;

import com.stackquestion.StackUsingQueues;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SatckQuestionTest {
    @Test
    public void testStackOperations() {
        StackUsingQueues stack = new StackUsingQueues();

        // Stack should be initially empty
        assertTrue(stack.isEmpty(), "Stack should be empty initially");

        // Push elements into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Stack should not be empty after pushing elements
        assertFalse(stack.isEmpty(), "Stack should not be empty after pushing elements");

        // Check the top element
        assertEquals(3, stack.top(), "Top element should be 3");

        // Pop elements and check if they follow LIFO order
        assertEquals(3, stack.pop(), "Popped element should be 3");
        assertEquals(2, stack.pop(), "Popped element should be 2");

        // After popping, top should be 1
        assertEquals(1, stack.top(), "Top element should be 1 after popping");

        // Pop last element
        assertEquals(1, stack.pop(), "Popped element should be 1");

        // Stack should be empty now
        assertTrue(stack.isEmpty(), "Stack should be empty after popping all elements");
    }

}
