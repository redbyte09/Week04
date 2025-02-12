package com.bankingsystem;

import java.util.*;

public class BankingSystem {
    private final Map<Integer, Double> accounts; // Stores AccountNumber -> Balance
    private final Queue<Integer> withdrawalQueue; // Stores withdrawal requests

    // Constructor initializes HashMap and Queue
    public BankingSystem() {
        this.accounts = new HashMap<>();
        this.withdrawalQueue = new LinkedList<>();
    }

    // Add a new account with initial balance
    public void addAccount(int accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
    }

    // Deposit money into an account
    public void deposit(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, accounts.get(accountNumber) + amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Request a withdrawal (added to queue)
    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.offer(accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Process the next withdrawal in the queue
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for Account: " + accountNumber);
        }
    }

    // Get accounts sorted by balance
    public Map<Integer, Double> getAccountsSortedByBalance() {
        return new TreeMap<>();
    }

    // Display all accounts
    public void displayAccounts() {
        System.out.println("Accounts: " + accounts);
        System.out.println("Sorted Accounts (by Balance): " + getAccountsSortedByBalance());
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Add accounts
        bank.addAccount(101, 5000);
        bank.addAccount(102, 7000);
        bank.addAccount(103, 3000);

        // Deposit money
        bank.deposit(101, 2000);
        bank.deposit(102, 1000);

        // Request withdrawals
        bank.requestWithdrawal(101);
        bank.requestWithdrawal(103);

        // Display accounts
        bank.displayAccounts();

        // Process withdrawals
        bank.processWithdrawals();
    }
}

