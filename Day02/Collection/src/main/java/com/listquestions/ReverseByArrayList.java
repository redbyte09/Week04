package com.listquestions;

import java.util.ArrayList;
import java.util.List;

public class ReverseByArrayList<T> {


    public ArrayList<T> reverse(ArrayList<T> list){
        int left=0;
        int right=list.size()-1;
        while(left<right){
            T temp=list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        return list;
    }
    public static void main(String[] args) {
        ReverseByArrayList<Integer> reverser = new ReverseByArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List"+list);
        ArrayList<Integer> reversedList = reverser.reverse(list);
        System.out.println("Reversed List"+reversedList);
    }
}
