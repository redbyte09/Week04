package com.advancereflectionquestions;

import java.lang.reflect.Method;

class Task {
    // A sample method that takes some time to execute
    void longRunningTask() {
        System.out.println("Task started...");
        try {
            Thread.sleep(1000); // Simulate time-consuming work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task finished!");
    }
}

public class MethodTimer {
    public static void main(String[] args) {
        try {
            Task task = new Task(); // Create object

            // Get the method using Reflection
            Method method = Task.class.getMethod("longRunningTask");

            // Measure start time
            long startTime = System.nanoTime();

            // Invoke the method dynamically
            method.invoke(task);

            // Measure end time
            long endTime = System.nanoTime();

            // Calculate execution time in milliseconds
            long executionTime = (endTime - startTime) / 1_000_000;
            System.out.println("⏳ Execution Time: " + executionTime + " ms");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

