package com.runtimeexception;

//import
import java.util.*;
import java.io.*;
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        //scanner object
        Scanner sc = new Scanner(System.in);
        //use try-catch block here
        try{
            System.out.println("Enter numerator");
            int numerator=sc.nextInt();
            System.out.println("Enter denominator");
            int denominator=sc.nextInt();
            int result=numerator/denominator;
            System.out.println(result);
            //use exception if error found
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by 0"+e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Please divide by numbers only"+e.getMessage());
        }
    }
}
