package com.votingsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class VotingSystemTest {
    private VotingSystem votingSystem;

    @BeforeEach
    void setUp() {
        votingSystem = new VotingSystem();

        // Casting votes
        votingSystem.castVote("Alica");
        votingSystem.castVote("Bobby");
        votingSystem.castVote("Alica");
        votingSystem.castVote("Chahat");
        votingSystem.castVote("Bobby");
        votingSystem.castVote("Bobby");
    }

    @Test
    void testVoteCount() {
        Map<String, Integer> expectedVotes = new HashMap<>();
        expectedVotes.put("Alice", 2);
        expectedVotes.put("Bob", 3);
        expectedVotes.put("Charlie", 1);

        assertEquals(expectedVotes, votingSystem.getSortedResults());
    }
}
