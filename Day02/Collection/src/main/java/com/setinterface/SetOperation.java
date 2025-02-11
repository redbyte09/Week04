package com.setinterface;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {

    public static <T> Set<T> union(Set<T>set1, Set<T>set2){
        Set<T> unionSet=new HashSet<T>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static<T> Set<T> intersection(Set<T>set1, Set<T>set2){
        Set<T> intersectionSet=new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
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

        Set<Integer> unionResult=union(set1,set2);
        Set<Integer> intersectionResult=intersection(set1,set2);

        System.out.println("Union"+unionResult);
        System.out.println("Intersection"+intersectionResult);
    }
}
