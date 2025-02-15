package com.listoperations;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

    // Create an instance of ListManager
    ListManager listManager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);

        // Check if 2 elements are added
        assertEquals(2, list.size());
        // Check if 10 is in the list
        assertTrue(list.contains(10));
        // Check if 20 is in the list
        assertTrue(list.contains(20));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 30);
        listManager.addElement(list, 40);

        boolean isRemoved = listManager.removeElement(list, 30);

        assertTrue(isRemoved); // Check if element is successfully removed
        assertEquals(1, list.size()); // List size should be 1 after removal
        assertFalse(list.contains(30)); // Check that 30 is no longer in the list
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 50);
        listManager.addElement(list, 60);
        listManager.addElement(list, 70);

        assertEquals(3, listManager.getSize(list));
    }
}

