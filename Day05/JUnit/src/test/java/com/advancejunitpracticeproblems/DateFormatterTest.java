package com.advancejunitpracticeproblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    // Test valid date format conversion
    @Test
    void testValidDateFormat() {
        assertEquals("15-08-2024", DateFormatter.formatDate("2024-08-15"));
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"));
    }

    // Test invalid date format handling
    @Test
    void testInvalidDateFormat() {
        // Wrong format
        assertEquals("Invalid Date Format", DateFormatter.formatDate("15-08-2024"));
        // Wrong separator
        assertEquals("Invalid Date Format", DateFormatter.formatDate("2024/08/15"));
        // Nonsense input
        assertEquals("Invalid Date Format", DateFormatter.formatDate("abcd-ef-gh"));
    }
}

