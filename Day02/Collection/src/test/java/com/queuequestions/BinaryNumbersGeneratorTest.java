package com.queuequestions;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BinaryNumbersGeneratorTest {

    @Test
    void testGenerateBinaryNumbers() {
        assertEquals(List.of("1", "10", "11", "100", "101"), BinaryNumbersGenerator.generateBinaryNumbers(5));
    }
}