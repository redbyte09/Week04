package com.intermediatelevelquestions;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    // Public methods
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class ReflectionDynamicMethod {
    public static void main(String[] args) {
        try {
            // Create an instance of MathOperations
            MathOperations math = new MathOperations();

            // Get the Class object
            Class<?> mathClass = math.getClass();

            // User input for method name
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter method name (add / subtract / multiply): ");
            String methodName = scanner.nextLine();

            // Get method reference dynamically
            Method method = mathClass.getMethod(methodName, int.class, int.class);

            // Ask user for numbers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            scanner.close();

            // Invoke the method dynamically
            int result = (int) method.invoke(math, num1, num2);

            // Display the result
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Error: Invalid method name or input!");
        }
    }
}

