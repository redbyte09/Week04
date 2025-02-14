package com.banktransaction;

import java.util.Scanner;

public class BankTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize bank account with a starting balance
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        try {
            // Taking user input for withdrawal amount
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            // Attempting to withdraw the amount
            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage()); // Handle custom exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Handle negative amount
        } finally {
            System.out.println("Transaction completed.");
        }

        // Close the scanner
        sc.close();
    }
}