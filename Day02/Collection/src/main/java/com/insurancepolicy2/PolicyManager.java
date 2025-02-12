package com.insurancepolicy2;

import java.time.LocalDate;
import java.util.*;

class PolicyManager {
    private Map<String, Policy> policyMap = new HashMap<>(); // Store policies by policy number
    private Map<String, Policy> orderedPolicyMap = new LinkedHashMap<>(); // Maintain insertion order
    private TreeMap<LocalDate, List<Policy>> sortedByExpiry = new TreeMap<>(); // Sort by expiry date

    // Add a new policy
    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicyMap.put(policy.getPolicyNumber(), policy);

        // Store policy in TreeMap for sorting by expiry date
        sortedByExpiry.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
    }

    // Retrieve policy by policy number
    public Policy getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List all policies expiring within the next 30 days
    public List<Policy> getExpiringPolicies() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);
        List<Policy> expiringPolicies = new ArrayList<>();

        for (Map.Entry<LocalDate, List<Policy>> entry : sortedByExpiry.entrySet()) {
            if (!entry.getKey().isAfter(limit)) { // If expiry date is within next 30 days
                expiringPolicies.addAll(entry.getValue());
            } else {
                break; // Stop as TreeMap is sorted
            }
        }
        return expiringPolicies;
    }

    // List all policies for a specific policyholder
    public List<Policy> getPoliciesByHolder(String holderName) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.getPolicyHolder().equalsIgnoreCase(holderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<String, Policy>> iterator = policyMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Policy policy = iterator.next().getValue();
            if (policy.getExpiryDate().isBefore(today)) {
                iterator.remove(); // Remove from HashMap
                orderedPolicyMap.remove(policy.getPolicyNumber()); // Remove from LinkedHashMap
                sortedByExpiry.get(policy.getExpiryDate()).remove(policy); // Remove from TreeMap
            }
        }
    }

    // Display all policies
    public void displayPolicies() {
        for (Policy policy : orderedPolicyMap.values()) {
            System.out.println(policy);
        }
    }
}

