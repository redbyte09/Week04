package com.advancejunitpracticeproblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    // Runs before each test, initializing account with 100 balance
    @BeforeEach
    void setUp() {
        account = new BankAccount(100.0);
    }

    // Test deposit functionality
    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), "Balance should increase after deposit");
    }

    // Test withdraw functionality
    @Test
    void testWithdraw() {
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance(), "Balance should decrease after withdrawal");
    }

    // Test insufficient funds scenario
    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200.0); // Attempt to withdraw more than balance
        });
        assertEquals("Insufficient funds or invalid amount", exception.getMessage(), "Should throw exception for insufficient funds");
    }

    // Test invalid deposit (negative amount)
    @Test
    void testNegativeDeposit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-10.0);
        });
        assertEquals("Deposit amount must be positive", exception.getMessage(), "Should throw exception for negative deposit");
    }
}
