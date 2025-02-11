package com.setinterfacetesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class SetEqualityCheckerTesting {

    @Test
    public void testEquals(){
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        Assertions.assertTrue(set1.equals(set2));
    }
}
