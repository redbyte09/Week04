package com.queuequestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements from the queue into the stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Pop all elements from the stack back into the queue
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Original Queue: " + queue);
        Queue<Integer> reversedQueue = reverseQueue(queue);
        System.out.println("Reversed Queue: " + reversedQueue);
    }
}

