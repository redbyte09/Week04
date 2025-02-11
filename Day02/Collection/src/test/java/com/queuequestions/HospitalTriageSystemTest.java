package com.queuequestions;

import org.junit.jupiter.api.Test;
import java.util.PriorityQueue;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.*;

class HospitalTriageSystemTest {

    @Test
    void testTriageOrder() {
        // Create a priority queue with custom comparator (higher severity first)
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(Comparator.comparingInt(p -> -p.severity));

        // Adding patients
        Patient john = new Patient("John", 3);
        Patient alice = new Patient("Alice", 5);
        Patient bob = new Patient("Bob", 2);

        triageQueue.add(john);
        triageQueue.add(alice);
        triageQueue.add(bob);

        // Check if patients are dequeued in correct order
        assertEquals(alice, triageQueue.poll()); // Highest severity first
        assertEquals(john, triageQueue.poll());  // Next highest
        assertEquals(bob, triageQueue.poll());   // Lowest severity
    }

    // Inner class for the Patient (since it was defined in the main class)
    static class Patient {
        String name;
        int severity;

        public Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        // Override equals to compare patients correctly in tests
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Patient patient = (Patient) obj;
            return severity == patient.severity && name.equals(patient.name);
        }

        @Override
        public int hashCode() {
            return name.hashCode() + severity;
        }
    }
}

