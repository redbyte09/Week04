package com.listquestions;

import java.util.*;

public class ListRotator<T> {

    // Method to rotate elements of a list
    public List<T> rotate(List<T> list, int positions) {
        int size = list.size();

        // Handle cases where positions > size or positions < 0
        positions = positions % size;
        if (positions < 0) {
            positions += size; // Convert negative rotation to positive
        }

        // Create a new rotated list
        List<T> rotatedList = new ArrayList<>();

        // Add elements from 'positions' to the end
        rotatedList.addAll(list.subList(positions, size));

        // Add the first 'positions' elements at the end
        rotatedList.addAll(list.subList(0, positions));

        return rotatedList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;

        ListRotator<Integer> rotator = new ListRotator<>();
        List<Integer> rotatedList = rotator.rotate(numbers, rotateBy);

        System.out.println("Original List: " + numbers);
        System.out.println("Rotated List: " + rotatedList);
    }
}

