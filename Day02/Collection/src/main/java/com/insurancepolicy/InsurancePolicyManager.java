package com.insurancepolicy;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class InsurancePolicyManager {
    private Set<InsurancePolicy> hashSetPolicies;
    private Set<InsurancePolicy> linkedHashSetPolicies;
    private Set<InsurancePolicy> treeSetPolicies;

    public InsurancePolicyManager() {
        hashSetPolicies = new HashSet<>();
        linkedHashSetPolicies = new LinkedHashSet<>();
        treeSetPolicies = new TreeSet<>();
    }

    public void addPolicy(InsurancePolicy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public void displayPolicies() {
        System.out.println("\nPolicies in HashSet (Unordered, Fast Lookup):");
        for (InsurancePolicy policy : hashSetPolicies) {
            System.out.println(policy);
        }

        System.out.println("\nPolicies in LinkedHashSet (Insertion Order):");
        for (InsurancePolicy policy : linkedHashSetPolicies) {
            System.out.println(policy);
        }

        System.out.println("\nPolicies in TreeSet (Sorted by Expiry Date):");
        for (InsurancePolicy policy : treeSetPolicies) {
            System.out.println(policy);
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        InsurancePolicy policy1 = new InsurancePolicy("P001", "Alica", LocalDate.of(2025, 5, 10), "Health", 5000);
        InsurancePolicy policy2 = new InsurancePolicy("P002", "Bobby", LocalDate.of(2024, 8, 15), "Auto", 3000);
        InsurancePolicy policy3 = new InsurancePolicy("P003", "Chahat", LocalDate.of(2026, 2, 20), "Home", 7000);
        InsurancePolicy policy4 = new InsurancePolicy("P004", "Daya", LocalDate.of(2023, 11, 25), "Health", 4500);

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);
        manager.addPolicy(policy4);

        manager.displayPolicies();
    }
}