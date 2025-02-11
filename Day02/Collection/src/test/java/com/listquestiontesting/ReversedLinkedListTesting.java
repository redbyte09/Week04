package com.listquestiontesting;

import com.listquestions.ReverseLinkedList;  // Import the correct class
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class ReversedLinkedListTesting {

    @Test
    void testReverseLinkedList() {
        // Create an object of ReverseLinkedList
        ReverseLinkedList<Integer> r = new ReverseLinkedList<>();

        // Create and populate the LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        // Reverse the list using the method from ReverseLinkedList
        LinkedList<Integer> reversedList = r.reverse(list);

        // Create the expected reversed list
        LinkedList<Integer> expectedList = new LinkedList<>();
        expectedList.add(5);
        expectedList.add(4);
        expectedList.add(3);
        expectedList.add(2);
        expectedList.add(1);


        // Assert that the reversed list matches the expected list
        Assertions.assertEquals(expectedList, reversedList);
    }
}
