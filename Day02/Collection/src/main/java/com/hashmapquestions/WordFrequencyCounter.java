package com.hashmapquestions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String fileName = "C:\\Capg\\Week04\\Day02\\Collection\\src\\main\\java\\com\\hashmapquestions\\input.txt";
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {
                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z\\s]", "");

                // Split words by spaces
                String[] words = line.split("\\s+");

                // Count word occurrences
                for (String word : words) {
                    if (!word.isEmpty()) { // Ignore empty words (extra spaces)
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Display word frequencies
        System.out.println("Word Frequency Count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

