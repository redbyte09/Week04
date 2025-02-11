package com.listquestions;

import java.util.*;

public class ReverseLinkedList<T> {
    // Method to reverse a LinkedList
    public LinkedList<T> reverse(LinkedList<T> list) {
        // Create a new LinkedList to store reversed elements
        LinkedList<T> reversedList = new LinkedList<>();

        // Loop through the original list
        for (T element : list) {
            // Insert each element at the beginning
            reversedList.addFirst(element);
        }

        // Return the new reversed list
        return reversedList;
    }

    public static void main(String[] args) {
        // Create an object of ReverseLinkedList
        ReverseLinkedList<Integer> reverser = new ReverseLinkedList<>();

        // Create a LinkedList and add elements
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print original list
        System.out.println("Original List: " + list);

        // Reverse the list
        LinkedList<Integer> reversedList = reverser.reverse(list);

        // Print reversed list
        System.out.println("Reversed List: " + reversedList);
    }
}
