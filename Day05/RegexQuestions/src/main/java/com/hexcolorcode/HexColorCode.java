package com.hexcolorcode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {

    public static boolean isHexColorCode(String Color){

        String color="^#([A-Fa-f0-9]{6})$";

        Pattern pattern = Pattern.compile(color);
        Matcher matcher = pattern.matcher(Color);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your color: ");
        String Color= sc.next();
        if(isHexColorCode(Color)){
            System.out.println("Your color is a Hex Color");
        }
        else{
            System.out.println("Your color is not a Hex Color");
        }
    }
}
