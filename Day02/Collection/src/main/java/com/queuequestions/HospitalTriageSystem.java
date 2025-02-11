package com.queuequestions;

import java.util.PriorityQueue;
import java.util.Comparator;

// Class representing a patient
class Patient {
    String name;
    int severity;

    // Constructor
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    // Override toString() to display patient details
    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

// Main class to implement the hospital triage system
public class HospitalTriageSystem {
    public static void main(String[] args) {
        // Create a priority queue with a custom comparator
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(Comparator.comparingInt(p -> -p.severity));

        // Adding patients to the queue
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        // Processing patients in order of severity (higher severity first)
        System.out.println("Patients will be treated in the following order:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll()); // Remove and print the highest priority patient
        }
    }
}

