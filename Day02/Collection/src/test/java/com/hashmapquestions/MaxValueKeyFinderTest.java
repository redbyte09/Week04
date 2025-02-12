package com.hashmapquestions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class MaxValueKeyFinderTest {

    @Test
    public void testFindMaxKey_BasicCase() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        assertEquals("B", MaxValueKeyFinder.findMaxKey(inputMap));
    }
}
