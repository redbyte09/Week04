package com.listquestiontesting;

import com.listquestions.ReverseByArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ReverseByArrayListTesting {
    @Test
    void test1() {
        ReverseByArrayList<Integer> r = new ReverseByArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        ArrayList<Integer> reversedList = r.reverse(list);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);

        Assertions.assertEquals(reversedList,arr2);

//        Assertions.assertEquals(42, result, "The result should be 42");
    }
}
