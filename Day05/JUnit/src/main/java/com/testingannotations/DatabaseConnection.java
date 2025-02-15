package com.testingannotations;

public class DatabaseConnection {
    private boolean isConnected = false;

    // Simulate database connection
    public void connect() {
        isConnected = true;
        System.out.println("Database Connected");
    }

    // Simulate closing database connection
    public void disconnect() {
        isConnected = false;
        System.out.println("Database Disconnected");
    }

    // Method to check connection status
    public boolean isConnected() {
        return isConnected;
    }
}

