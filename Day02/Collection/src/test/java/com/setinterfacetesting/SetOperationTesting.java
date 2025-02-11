package com.setinterfacetesting;

import com.setinterface.SetOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class SetOperationTesting {
    @Test

    public void testUnion() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);


        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedUnion = new HashSet<>();
        expectedUnion.add(1);
        expectedUnion.add(2);
        expectedUnion.add(3);
        expectedUnion.add(4);
        expectedUnion.add(5);

        Assertions.assertEquals(expectedUnion, SetOperation.union(set1, set2));
    }

    @Test
    public void testIntersection() {
        Set<Integer> set1= new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 =new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedIntersection = new HashSet<>();
        expectedIntersection.add(3);

        Assertions.assertEquals(expectedIntersection, SetOperation.intersection(set1, set2));
    }
}
