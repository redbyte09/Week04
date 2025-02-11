package com.listquestiontesting;

import com.listquestions.NthElementFromEnd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class NthElementFromEndTesting {

    @Test
        public void testFindNthFromEnd_ValidCase() {
            NthElementFromEnd<String> finder = new NthElementFromEnd<>();
            LinkedList<String> list = new LinkedList<>();
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            list.add("E");

            String result = finder.findNthFromEnd(list, 2);
            Assertions.assertEquals("D", result);
        }

}
