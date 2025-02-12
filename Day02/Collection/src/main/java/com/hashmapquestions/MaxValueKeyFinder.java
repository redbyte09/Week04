package com.hashmapquestions;

import java.util.*;

public class MaxValueKeyFinder {
    public static <K, V extends Comparable<V>> K findMaxKey(Map<K, V> inputMap) {
        if (inputMap == null || inputMap.isEmpty()) {
            // Return null if the map is empty
            return null;
        }

        K maxKey = null;
        V maxValue = null;

        for (Map.Entry<K, V> entry : inputMap.entrySet()) {
            if (maxValue == null || entry.getValue().compareTo(maxValue) > 0) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        // Example input map
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        // Find and print the key with the highest value
        String maxKey = findMaxKey(inputMap);
        System.out.println("Key with the highest value: " + maxKey);
    }
}

