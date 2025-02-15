package com.advancejunitpracticeproblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    // Test valid passwords
    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.isValidPassword("StrongPass1"), "Valid password should pass");
        assertTrue(PasswordValidator.isValidPassword("JavaRocks9"), "Valid password should pass");
    }

    //Test invalid passwords (less than 8 characters)
    @Test
    void testShortPasswords() {
        assertFalse(PasswordValidator.isValidPassword("Jav1"), "Too short should fail");
    }

    // Test invalid passwords (no uppercase letter)
    @Test
    void testNoUpperCase() {
        assertFalse(PasswordValidator.isValidPassword("weakpassword1"), "No uppercase should fail");
    }

    // Test invalid passwords (no digit)
    @Test
    void testNoDigit() {
        assertFalse(PasswordValidator.isValidPassword("NoNumberHere"), "No digit should fail");
    }

    // Test invalid passwords (null or empty string)
    @Test
    void testNullAndEmptyPassword() {
        assertFalse(PasswordValidator.isValidPassword(null), "Null password should fail");
        assertFalse(PasswordValidator.isValidPassword(""), "Empty password should fail");
    }
}

