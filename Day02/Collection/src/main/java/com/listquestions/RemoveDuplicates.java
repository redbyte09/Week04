package com.listquestions;
import java.util.*;

      public class RemoveDuplicates<T> {
        // Method to remove duplicates while preserving order
        public List<T> removeDuplicates(List<T> list) {
            Set<T> seen = new HashSet<>();
            List<T> result = new ArrayList<>();

            for (T element : list) {
                if (!seen.contains(element)) {
                    seen.add(element);  // Mark element as seen
                    result.add(element); // Add unique element to result
                }
            }
            return result;
        }

        public static void main(String[] args) {
            // Example input list
            List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);

            // Create an instance of RemoveDuplicates
            RemoveDuplicates<Integer> remover = new RemoveDuplicates<>();

            // Get the result after removing duplicates
            List<Integer> uniqueList = remover.removeDuplicates(numbers);

            // Print the result
            System.out.println("Original List: " + numbers);
            System.out.println("List After Removing Duplicates: " + uniqueList);
        }
    }


