package com.setinterfacetesting;

// Import the class containing the symmetric difference method
import com.setinterface.SetOperationOfSymmetry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class SetOperationOfSymmetryTesting {

    @Test  // Marks this method as a test case
    public void symmetricDifferenceTest() {
        // Create first set with elements {1, 2, 3}
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Create second set with elements {3, 4, 5}
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Expected output: Elements present in either set but not in both → {1, 2, 4, 5}
        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(5);

        // Call the symmetricDifference method from SetOperationOfSymmetry
        Set<Integer> result = SetOperationOfSymmetry.symmetricDifference(set1, set2);

        // Verify that the result matches the expected output
        Assertions.assertEquals(expected, result);
    }
}
