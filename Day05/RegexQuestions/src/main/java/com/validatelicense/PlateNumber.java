package com.validatelicense;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PlateNumber {

    public static boolean isValidPlateNumber(String plateNumber) {
        String plate="^[A-Z]{2}\\d{4}$";

        Pattern pattern = Pattern.compile(plate);
        Matcher matcher = pattern.matcher(plateNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your PlateNumber: ");
        String PlateNumber= sc.next();
        if(isValidPlateNumber(PlateNumber)){
            System.out.println("Valid PlateNumber");
        }
        else{
            System.out.println("Invalid PlateNumber");
        }
    }
}
