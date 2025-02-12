package com.insurancepolicy2;

import java.time.LocalDate;

public class InsuranceSystem {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        // Adding policies
        manager.addPolicy(new Policy("P1001", "Alica", LocalDate.of(2025, 5, 10)));
        manager.addPolicy(new Policy("P1002", "Bobbby", LocalDate.of(2024, 7, 15)));  // Expires soon
        manager.addPolicy(new Policy("P1003", "Chahat", LocalDate.of(2023, 12, 10))); // Expired
        manager.addPolicy(new Policy("P1004", "Alica", LocalDate.of(2024, 8, 20)));  // Another Alice policy

        // Display all policies
        System.out.println("All Policies:");
        manager.displayPolicies();

        // Retrieve a policy
        System.out.println("\nRetrieve Policy P1001:");
        System.out.println(manager.getPolicy("P1001"));

        // List policies expiring in next 30 days
        System.out.println("\nPolicies Expiring in Next 30 Days:");
        System.out.println(manager.getExpiringPolicies());

        // Get policies by policyholder
        System.out.println("\nPolicies for Alica:");
        System.out.println(manager.getPoliciesByHolder("Alica"));

        // Remove expired policies
        manager.removeExpiredPolicies();
        System.out.println("\nAfter Removing Expired Policies:");
        manager.displayPolicies();
    }
}

