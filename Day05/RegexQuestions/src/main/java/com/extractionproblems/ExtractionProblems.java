package com.extractionproblems;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractionProblems {

    // Method to extract and print all email addresses
    public static void extractEmails(String text) {
        // Define the regex pattern for an email
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher object
        Matcher matcher = pattern.matcher(text);

        System.out.println("\nExtracted Email Addresses:");
        boolean found = false;

        // Find and print all matches
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        // If no emails found, print message
        if (!found) {
            System.out.println("No valid email addresses found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text containing email addresses:");
        String text = sc.nextLine(); // Read the input text

        // Call the method to extract emails
        extractEmails(text);

        sc.close(); // Close the scanner
    }
}

