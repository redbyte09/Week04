package com.repeatingwords;

import java.util.*;
import java.util.regex.*;

public class FindRepeatingWords {
    public static void findDuplicates(String text) {
        // Convert text to lowercase to make the search case-insensitive
        text = text.toLowerCase();

        // Split text into words using regex
        String[] words = text.split("\\s+");

        // Use a HashMap to store word counts
        Map<String, Integer> wordCount = new HashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print words that appear more than once
        System.out.println("\nRepeating Words:");
        boolean found = false;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                found = true;
            }
        }

        // If no repeating words found
        if (!found) {
            System.out.println("No repeating words found.");
        }
    }

    public static void main(String[] args) {
        // Example input
        String input = "This is is a repeated repeated word test.";

        // Call function to find repeating words
        findDuplicates(input);
    }
}

