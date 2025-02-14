package com.throwvsthrows;

import java.util.Scanner;

public class ExceptionPropagationExample {

    // Method to calculate interest
    // It declares that it might throw an IllegalArgumentException
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        // Check for invalid input (negative amount or rate)
        if (amount < 0 || rate < 0) {
            // Throw an exception if input is invalid
            throw new IllegalArgumentException("Amount and rate must be positive");
        }

        // Formula for calculating simple interest: Interest = (amount * rate * years) / 100
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter principal amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter interest rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter number of years: ");
            int years = sc.nextInt();

            // Calling the method which might throw an exception
            double interest = calculateInterest(amount, rate, years);

            // Printing the calculated interest
            System.out.println("Calculated Interest: " + interest);

        } catch (IllegalArgumentException e) {
            // Handling the exception
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

