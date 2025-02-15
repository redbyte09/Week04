package com.datequestion;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractDates {
    // Method to extract and print all dates from a given text
    public static void extractDates(String text) {
        // Regex pattern for dates in dd/mm/yyyy format
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d{4})\\b";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("\nExtracted Dates:");
        boolean found = false;

        // Loop through all matches and print them
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            found = true;
        }

        // If no dates found, print a message
        if (!found) {
            System.out.println("No valid dates found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a sentence containing dates:");
        String input = sc.nextLine();

        // Call the method to extract dates
        extractDates(input);

        sc.close();
    }
}
