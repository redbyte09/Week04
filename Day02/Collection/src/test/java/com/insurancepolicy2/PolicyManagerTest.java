package com.insurancepolicy2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PolicyManagerTest {
    private PolicyManager manager;

    @BeforeEach
    void setUp() {
        manager = new PolicyManager();

        // Adding test policies
        manager.addPolicy(new Policy("P1001", "Alica", LocalDate.of(2025, 5, 10)));
        manager.addPolicy(new Policy("P1002", "Bobby", LocalDate.now().plusDays(15))); // Expires in 15 days
        manager.addPolicy(new Policy("P1003", "Chahat", LocalDate.now().minusDays(10))); // Expired
        manager.addPolicy(new Policy("P1004", "Alica", LocalDate.of(2024, 8, 20)));
    }

    @Test
    void testRetrievePolicyByNumber() {
        Policy policy = manager.getPolicy("P1001");
        assertNotNull(policy);
        assertEquals("Alica", policy.getPolicyHolder());
        assertEquals(LocalDate.of(2025, 5, 10), policy.getExpiryDate());
    }

    @Test
    void testGetExpiringPolicies() {
        List<Policy> expiringPolicies = manager.getExpiringPolicies();
        assertFalse(expiringPolicies.isEmpty());

        // The policy expiring in 15 days should be in the result
        assertTrue(expiringPolicies.stream().anyMatch(p -> p.getPolicyNumber().equals("P1002")));
    }

    @Test
    void testGetPoliciesByHolder() {
        List<Policy> alicePolicies = manager.getPoliciesByHolder("Alica");
        assertEquals(2, alicePolicies.size()); // Alice has 2 policies
    }

    @Test
    void testRemoveExpiredPolicies() {
        manager.removeExpiredPolicies();
        assertNull(manager.getPolicy("P1003")); // Expired policy should be removed
    }
}

