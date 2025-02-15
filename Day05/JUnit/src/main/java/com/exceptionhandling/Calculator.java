package com.exceptionhandling;

public class Calculator {

    // Division method that throws ArithmeticException if denominator is zero
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
