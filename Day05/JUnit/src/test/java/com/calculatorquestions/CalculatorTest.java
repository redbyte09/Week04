package com.calculatorquestions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator(); // Create an instance of Calculator

    // Test for addition
    @Test
    void testAdd() {
        assertEquals(10, calculator.add(6, 4));
        assertEquals(0, calculator.add(-5, 5));
    }

    // Test for subtraction
    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(6, 4));
        assertEquals(-10, calculator.subtract(-5, 5));
    }

    // Test for multiplication
    @Test
    void testMultiply() {
        assertEquals(24, calculator.multiply(6, 4));
        assertEquals(0, calculator.multiply(0, 5));
    }

    // Test for division
    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(8, 4));
        assertEquals(-3, calculator.divide(-9, 3));
    }

    // Test for division by zero (exception handling)
    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

