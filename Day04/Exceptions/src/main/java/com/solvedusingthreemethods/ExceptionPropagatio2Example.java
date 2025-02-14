package com.solvedusingthreemethods;

public class ExceptionPropagatio2Example {

    // Method that causes an exception (division by zero)
    public static void method1() {
        System.out.println("Inside method1");
        // This will throw ArithmeticException
        int result = 10 / 0; 
    }

    // Method that calls method1()
    public static void method2() {
        System.out.println("Inside method2");
        // Calls method1(), exception propagates to method2()
        method1(); 
    }

    public static void main(String[] args) {
        try {
            System.out.println("Inside main");
            // Calls method2(), exception propagates to main()
            method2(); 
        } catch (ArithmeticException e) {
            // Handling exception in main()
            System.out.println("Handled exception in main: " + e.getMessage());
        }
    }
}

