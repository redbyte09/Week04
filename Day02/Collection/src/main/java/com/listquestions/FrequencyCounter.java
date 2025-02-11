package com.listquestions;

import java.util.*;

public class FrequencyCounter<T> {
    // Method to count frequency of elements
    public Map<T, Integer> countFrequency(List<T> list) {
        Map<T, Integer> frequencyMap = new HashMap<>();

        //use for each loop
        for (T element : list) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }


        return frequencyMap;
    }

    public static void main(String[] args) {
        // Example List of Strings
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");

        // Create an object of FrequencyCounter for Strings
        FrequencyCounter<String> counter = new FrequencyCounter<>();

        // Count frequency of words
        Map<String, Integer> result = counter.countFrequency(words);

        // Print the frequency count
        System.out.println("Word Frequencies: " + result);
    }
}

