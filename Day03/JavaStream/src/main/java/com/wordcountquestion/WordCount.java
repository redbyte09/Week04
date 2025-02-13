package com.wordcountquestion;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void countWordsAndDisplayTop5(String filePath) {
        Map<String, Integer> wordMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {  // Read file line by line
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);  // Count word occurrences
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort words by frequency in descending order
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Display the top 5 most frequent words
        System.out.println("Top 5 most frequent words:");
        for (int i = 0; i < Math.min(5, sortedList.size()); i++) {
            System.out.println(sortedList.get(i).getKey() + " - " + sortedList.get(i).getValue() + " times");
        }
    }

    // Main method to test with a sample file
    public static void main(String[] args) {
        String filePath = "C:\\Users\\saksh\\OneDrive\\Desktop\\largefile.txt";  // Update with the correct path
        countWordsAndDisplayTop5(filePath);
    }
}
