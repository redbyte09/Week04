package com.extractlinks;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractLinks {
    // Method to extract and print all links from a given text
    public static void extractLinks(String text) {
        // Regex pattern to match URLs (http or https)
        String regex = "https?://[\\w.-]+(?:\\.[a-zA-Z]{2,6})+\\S*";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("\nExtracted Links:");
        boolean found = false;

        // Loop through all matches and print them
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        // If no links found, print a message
        if (!found) {
            System.out.println("No links found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a sentence containing links:");
        String input = scanner.nextLine();

        // Call the method to extract links
        extractLinks(input);

        scanner.close(); // Close the scanner
    }
}

