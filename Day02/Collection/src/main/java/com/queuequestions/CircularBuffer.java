package com.queuequestions;

import java.util.Arrays;

public class CircularBuffer {
    // Array to store buffer elements
    private int[] buffer;
    // Maximum size of the buffer
    private int size;
    // Points to the front element
    private int front;
    // Points to the last element
    private int rear;
    // Number of elements in the buffer
    private int count;

    // Constructor: Initialize the buffer with a fixed size
    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    // Insert an element into the buffer
    public void insert(int value) {
        // Move rear forward (circular)
        rear = (rear + 1) % size;
        buffer[rear] = value;

        // If the buffer is full, move the front pointer
        if (count == size) {
            front = (front + 1) % size;
        } else {
            // Increase element count if not full
            count++;
        }
    }

    // Retrieve the current buffer contents
    public int[] getBufferContents() {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            // Retrieve elements in correct order
            result[i] = buffer[(front + i) % size];
        }
        return result;
    }

    // Display buffer contents
    public void displayBuffer() {
        System.out.println("Buffer: " + Arrays.toString(getBufferContents()));
    }

    // Main method for testing
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        // Insert elements into the buffer
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.displayBuffer(); // Expected: [1, 2, 3]

        // Insert an element (4), which should overwrite 1
        cb.insert(4);
        cb.displayBuffer(); // Expected: [2, 3, 4]

        // Insert more elements
        cb.insert(5);
        cb.insert(6);
        cb.displayBuffer(); // Expected: [4, 5, 6]
    }
}
