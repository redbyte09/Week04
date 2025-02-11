package com.insurancepolicy;

import java.time.LocalDate;
import java.util.*;

public class PerformanceTest {
    private static final int NUM_POLICIES = 100000; // Adjust for larger tests

    public static void main(String[] args) {
        Set<InsurancePolicy> hashSet = new HashSet<>();
        Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
        Set<InsurancePolicy> treeSet = new TreeSet<>();

        System.out.println("Performance Test for HashSet, LinkedHashSet, and TreeSet\n");

        // Measure time for adding policies
        measurePerformance("HashSet Add", hashSet, "add");
        measurePerformance("LinkedHashSet Add", linkedHashSet, "add");
        measurePerformance("TreeSet Add", treeSet, "add");

        // Measure time for searching policies
        measurePerformance("HashSet Search", hashSet, "search");
        measurePerformance("LinkedHashSet Search", linkedHashSet, "search");
        measurePerformance("TreeSet Search", treeSet, "search");

        // Measure time for removing policies
        measurePerformance("HashSet Remove", hashSet, "remove");
        measurePerformance("LinkedHashSet Remove", linkedHashSet, "remove");
        measurePerformance("TreeSet Remove", treeSet, "remove");
    }

    // Method to measure time taken for add, search, and remove operations
    private static void measurePerformance(String testName, Set<InsurancePolicy> set, String operation) {
        long startTime = System.nanoTime();

        switch (operation) {
            case "add":
                for (int i = 0; i < NUM_POLICIES; i++) {
                    InsurancePolicy policy = new InsurancePolicy(
                            "P" + i, "Holder" + i, LocalDate.of(2025, 5, 10), "Health", 5000);
                    set.add(policy);
                }
                break;

            case "search":
                for (int i = 0; i < NUM_POLICIES; i++) {
                    set.contains(new InsurancePolicy("P" + (NUM_POLICIES / 2), "Holder", LocalDate.of(2025, 5, 10), "Health", 5000));
                }
                break;

            case "remove":
                Iterator<InsurancePolicy> iterator = set.iterator();
                while (iterator.hasNext()) {
                    iterator.next();
                    iterator.remove();
                }
                break;
        }

        long endTime = System.nanoTime();
        System.out.println(testName + " took " + (endTime - startTime) / 1e6 + " ms");
    }
}
