package com.setinterface;

//import
import java.util.HashSet;
import java.util.Set;

//create class here
public class SetEqualityChecker {
    //create method here
    public static <T> boolean areSetEqual(Set<T> set1, Set<T> set2) {
        return set1.equals(set2);
    }

    //main method
    public static void main(String[] args) {
        //create a Set here
        Set<Integer> set1=new HashSet<>();
        //add element in the set
        set1.add(1);
        set1.add(2);
        set1.add(3);

        //create second Set
        Set<Integer>set2=new HashSet<>();
        //add element in the set2
        set2.add(3);
        set2.add(2);
        set2.add(1);

        //now call the method to check sets are equal or not
        boolean result=areSetEqual(set1,set2);
        System.out.println(result);
    }
}
