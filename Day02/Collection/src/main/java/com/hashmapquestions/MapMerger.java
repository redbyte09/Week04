package com.hashmapquestions;

import java.util.*;

public class MapMerger {
    // Generic method to merge two maps and sum values if the key exists in both
    public static <K, V extends Number> Map<K, V> mergeMaps(Map<K, V> map1, Map<K, V> map2) {
        // Copy map1 to avoid modifying original
        Map<K, V> mergedMap = new HashMap<>(map1);

        for (Map.Entry<K, V> entry : map2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), (v1, v2) ->
                    (V) Integer.valueOf(v1.intValue() + v2.intValue()) // Sum values
            );
        }

        return mergedMap;
    }

    public static void main(String[] args) {
        // Example input maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Merge the maps and print the result
        Map<String, Integer> result = mergeMaps(map1, map2);
        System.out.println("Merged Map: " + result);
    }
}

