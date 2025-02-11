package com.listquestiontesting;

import com.listquestions.FrequencyCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounterTesting {

    @Test
    public void Test1(){
        FrequencyCounter<String>counter=new FrequencyCounter<>();
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String ,Integer> expectedOutput = new HashMap<>();
        expectedOutput.put("apple",2);
        expectedOutput.put("banana",1);
        expectedOutput.put("orange",1);

        Map<String, Integer> result = counter.countFrequency(words);
        Assertions.assertEquals(expectedOutput,result);

    }
}
