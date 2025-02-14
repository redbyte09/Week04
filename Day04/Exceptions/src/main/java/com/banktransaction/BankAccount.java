package com.banktransaction;

import java.util.Scanner;

// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {
    private double balance;

    // Constructor to initialize account balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw amount from account
    public void withdraw(double amount) throws InsufficientBalanceException {
        // Check for negative amount
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount! Withdrawal cannot be negative.");
        }

        // Check for insufficient balance
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        // Deduct the amount and display new balance
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    // Method to display balance
    public double getBalance() {
        return balance;
    }
}




