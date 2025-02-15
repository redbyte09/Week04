package com.testingannotations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    private DatabaseConnection dbConnection;

    // Runs before each test to set up the connection
    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    // Runs after each test to close the connection
    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    void testConnectionEstablished() {
        assertTrue(dbConnection.isConnected(), "Connection should be established before test.");
    }

    @Test
    void testConnectionClosed() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected(), "Connection should be closed after disconnect.");
    }
}

