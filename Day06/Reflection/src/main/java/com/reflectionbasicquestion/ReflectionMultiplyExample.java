package com.reflectionbasicquestion;

import java.lang.reflect.Method;

    class Calculator {
        // Private method
        private int multiply(int a, int b) {
            return a * b;
        }
    }
    public class ReflectionMultiplyExample {
        public static void main(String[] args) {
            try {
                // Create an object of Calculator
                Calculator calculator = new Calculator();

                // Get the Class object
                Class<?> calculatorClass = calculator.getClass();

                // Access the private method "multiply"
                Method multiplyMethod = calculatorClass.getDeclaredMethod("multiply", int.class, int.class);
                multiplyMethod.setAccessible(true); // Allow access to private method

                // Invoke the method with arguments (5, 3)
                int result = (int) multiplyMethod.invoke(calculator, 5, 3);

                // Print the result
                System.out.println("Multiplication Result: " + result);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


