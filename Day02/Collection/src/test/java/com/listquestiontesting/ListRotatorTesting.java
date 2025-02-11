package com.listquestiontesting;

import com.listquestions.ListRotator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListRotatorTesting {

    @Test
    public void testRotationByTwoPositions() {
        ListRotator<Integer> rotator = new ListRotator<>();
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);

        List<Integer> result = rotator.rotate(numbers, 2);

        Assertions.assertEquals(expected, result);
    }
}
