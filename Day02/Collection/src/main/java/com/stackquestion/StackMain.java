package com.stackquestion;

public class StackMain {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        // Pushing elements
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Checking top element
        System.out.println("Top Element: " + stack.top()); // Output: 3

        // Popping top element
        System.out.println("Popped: " + stack.pop()); // Output: 3

        // Checking new top element
        System.out.println("New Top Element: " + stack.top()); // Output: 2
    }
}

