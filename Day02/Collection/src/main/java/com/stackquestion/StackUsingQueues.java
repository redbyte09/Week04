package com.stackquestion;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    private Queue<Integer> queue1; // Primary queue for stack operations
    private Queue<Integer> queue2; // Temporary queue used during pop operations

    // Constructor to initialize the queues
    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push operation: Adds an element to the stack
    public void push(int value) {
        queue1.add(value); // Enqueue into queue1
    }

    // Pop operation: Removes and returns the top element of the stack
    public int pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }

        // Move elements to queue2 until one element remains
        while (queue1.size() > 1) {
            queue2.add(queue1.poll()); // Dequeue from queue1 and enqueue into queue2
        }

        // The last remaining element in queue1 is the top of the stack
        int topElement = queue1.poll();

        // Swap the roles of queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Top operation: Returns the top element without removing it
    public int top() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }

        // Move elements to queue2 until one element remains
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        // The last remaining element in queue1 is the top of the stack
        int topElement = queue1.peek();
        queue2.add(queue1.poll()); // Move it to queue2

        // Swap the roles of queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}

