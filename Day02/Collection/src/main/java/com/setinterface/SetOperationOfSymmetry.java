package com.setinterface;

import java.util.HashSet;
import java.util.Set;

public class SetOperationOfSymmetry {

    public static <T> Set<T>symmetricDifference(Set<T>set1,Set<T>set2){
        Set<T> symDifference=new HashSet<>(set1);
        Set<T>temp=new HashSet<>(set2);

        symDifference.removeAll(set2);
        temp.removeAll(set1);

        symDifference.addAll(temp);
        return symDifference;
    }

    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);


        Set<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> differenceResult=symmetricDifference(set1,set2);
        System.out.println(differenceResult);
    }
}
