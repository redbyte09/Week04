package com.listquestiontesting;

import com.listquestions.RemoveDuplicates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesTesting {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates <Integer>removeDuplicates = new RemoveDuplicates();
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> expected = Arrays.asList(3, 1, 2, 4);
        List<Integer> result = removeDuplicates.removeDuplicates(input);
        Assertions.assertEquals(expected, result);
    }
}
