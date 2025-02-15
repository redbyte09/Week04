package com.advancejunitpracticeproblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    // Test valid user registration
    @Test
    void testValidUserRegistration() {
        assertEquals("User registered successfully!",
                UserRegistration.registerUser("JohnDoe", "johndoe@example.com", "SecurePass123"));
    }

    // Test empty username
    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("", "johndoe@example.com", "SecurePass123"));
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    // Test invalid email
    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("JohnDoe", "invalid-email", "SecurePass123"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    // Test short password
    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("JohnDoe", "johndoe@example.com", "123"));
        assertEquals("Password must be at least 8 characters long", exception.getMessage());
    }
}

