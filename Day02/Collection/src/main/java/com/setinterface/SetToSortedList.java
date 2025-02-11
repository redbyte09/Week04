package com.setinterface;

import java.util.*;

public class SetToSortedList {

    // Method to convert a Set to a Sorted List
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set); // Convert Set to List
        Collections.sort(sortedList); // Sort the List in ascending order
        return sortedList;
    }

    public static void main(String[] args) {
        // Create a HashSet with some numbers
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(5);
        numberSet.add(3);
        numberSet.add(9);
        numberSet.add(1);

        // Convert to sorted list
        List<Integer> sortedList = convertToSortedList(numberSet);

        // Print the result
        System.out.println("Sorted List: " + sortedList); // Output: [1, 3, 5, 9]
    }
}
