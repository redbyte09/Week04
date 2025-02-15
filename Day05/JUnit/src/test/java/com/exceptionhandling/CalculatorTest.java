package com.exceptionhandling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator(); // Create an instance of Calculator

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0); // This should throw an exception
        });

        // Verify the exception message
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

