package com.votingsystem;

import java.util.*;

public class VotingSystem {
    private final Map<String, Integer> voteCount;  // Stores votes for each candidate
    private final Map<String, Integer> voteOrder; // Stores votes in the order they were received

    // Constructor initializes both HashMap and LinkedHashMap
    public VotingSystem() {
        this.voteCount = new HashMap<>(); // Stores candidate votes
        this.voteOrder = new LinkedHashMap<>(); // Maintains the order of votes
    }

    // Method to cast a vote for a candidate
    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteOrder.getOrDefault(candidate, 0) + 1);
    }

    // Method to get vote count in sorted order using TreeMap
    public Map<String, Integer> getSortedResults() {
        return new TreeMap<>(voteCount);
    }

    // Method to get vote count in order of voting
    public Map<String, Integer> getVotingOrder() {
        return new LinkedHashMap<>(voteOrder);
    }

    // Display votes in descending order (winner first)
    public Map<String, Integer> getResultsDescending() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(voteCount.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Sort in descending order

        Map<String, Integer> sortedResults = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedResults.put(entry.getKey(), entry.getValue());
        }
        return sortedResults;
    }

    // Display final results
    public void displayResults() {
        System.out.println("Votes in the order they were cast: " + voteOrder);
        System.out.println("Sorted Votes (Alphabetical): " + getSortedResults());
        System.out.println("Sorted Votes (Descending): " + getResultsDescending());
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Casting votes
        votingSystem.castVote("Alica");
        votingSystem.castVote("Bobby");
        votingSystem.castVote("Alica");
        votingSystem.castVote("Chahat");
        votingSystem.castVote("Bobby");
        votingSystem.castVote("Bobby");

        // Display results
        votingSystem.displayResults();
    }
}

