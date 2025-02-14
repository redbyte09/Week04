package com.finallyblockexecution;
import java.util.Scanner;

public class FinallyBlockExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            // Performing division (may cause ArithmeticException if denominator is 0)
            int result = numerator / denominator;

            // Printing the result if no exception occurs
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handling division by zero exception
            System.out.println("Error: Cannot divide by zero!");

        } finally {
            // This block always executes, whether an exception occurs or not
            System.out.println("Operation completed.");
            sc.close();
        }
    }
}

