package com.performancetesting;

public class Task {

    // Simulating a long-running task
    public String longRunningTask() {
        try {
            Thread.sleep(3000); // 3 seconds delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }
}
