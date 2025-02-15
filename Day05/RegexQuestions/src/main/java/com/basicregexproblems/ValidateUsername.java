package com.basicregexproblems;

//import
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ValidateUsername {

    //create method here
    public static boolean isValidateUserName(String Username){
        //regex pattern here
        String text = "^[a-zA-Z][a-zA-Z0-9)_]{4,14}$";

        //create pattern and matches
        Pattern pattern = Pattern.compile(text);
        Matcher matcher = pattern.matcher(Username);
        return matcher.matches();

    }

    //main method
    public static void main(String[] args) {
        //input from user
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your username: ");
        String Username= sc.next();
        //call method here
       if( isValidateUserName(Username)){
           System.out.println("Valid username");
       }
       else{
           System.out.println("Invalid username");
       }

    }
}
