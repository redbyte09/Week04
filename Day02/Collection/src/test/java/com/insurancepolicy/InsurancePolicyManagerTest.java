package com.insurancepolicy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.TreeSet;
import static org.junit.jupiter.api.Assertions.*;

class InsurancePolicyManagerTest {

    private InsurancePolicyManager manager;
    private InsurancePolicy policy1, policy2, policy3, policy4;

    @Test
    void setUp() {
        manager = new InsurancePolicyManager();
        policy1 = new InsurancePolicy("P001", "Alica", LocalDate.of(2025, 5, 10), "Health", 5000);
        policy2 = new InsurancePolicy("P002", "Bobby", LocalDate.of(2024, 8, 15), "Auto", 3000);
        policy3 = new InsurancePolicy("P003", "Chahat", LocalDate.of(2026, 2, 20), "Home", 7000);
        policy4 = new InsurancePolicy("P004", "Daya", LocalDate.of(2023, 11, 25), "Health", 4500);
    }


}

