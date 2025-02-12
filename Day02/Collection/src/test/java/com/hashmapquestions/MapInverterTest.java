package com.hashmapquestions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class MapInverterTest {

    @Test
    public void testInvertMap_BasicCase() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(1, Arrays.asList("A", "C"));
        expected.put(2, Collections.singletonList("B"));

        assertEquals(expected, MapInverter.invertMap(inputMap));
    }

    @Test
    public void testInvertMap_SingleEntry() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("X", 5);

        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(5, Collections.singletonList("X"));

        assertEquals(expected, MapInverter.invertMap(inputMap));
    }
}
