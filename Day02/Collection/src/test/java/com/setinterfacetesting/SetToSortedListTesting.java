package com.setinterfacetesting;



import com.setinterface.SetToSortedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class SetToSortedListTesting {

    @Test
    public void testConvertToSortedList() {
        // Create a Set with unsorted integers
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(5);
        numberSet.add(3);
        numberSet.add(9);
        numberSet.add(1);

        // Expected sorted list
        List<Integer> expected = Arrays.asList(1, 3, 5, 9);

        // Call the method
        List<Integer> result = SetToSortedList.convertToSortedList(numberSet);

        // Assert the result is as expected
        Assertions.assertEquals(expected, result);
    }
}


