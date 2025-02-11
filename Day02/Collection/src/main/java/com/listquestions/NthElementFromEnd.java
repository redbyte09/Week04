package com.listquestions;

import java.util.LinkedList;
import java.util.ListIterator;

public class NthElementFromEnd<T> {

    public T findNthFromEnd(LinkedList<T> list, int N) {
        // If list is empty or N is invalid, return null
        if (list == null || list.isEmpty() || N <= 0) {
            return null;
        }

        // Create two iterators
        ListIterator<T> first = list.listIterator();
        ListIterator<T> second = list.listIterator();

        // Move 'first' pointer N steps forward
        for (int i = 0; i < N; i++) {
            if (!first.hasNext()) {
                return null; // N is larger than list size, return null
            }
            first.next();
        }

        // Move both pointers one step at a time until 'first' reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        // Now 'second' is at the Nth element from the end
        return second.next();
    }

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Create an object of the class
        NthElementFromEnd<String> finder = new NthElementFromEnd<>();

        // Find the 2nd element from the end
        String result = finder.findNthFromEnd(list, 2);

        // Print the result
        if (result != null) {
            System.out.println("Nth element from end: " + result); // Output: D
        } else {
            System.out.println("Invalid input or N is too large.");
        }
    }
}
