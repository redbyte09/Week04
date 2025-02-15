package com.modifystring;

import java.util.Scanner;

public class ReplaceMultipleSpaces {
    // Method to replace multiple spaces with a single space
    public static String replaceSpaces(String text) {
        // Replace multiple spaces with a single space
        return text.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a sentence with multiple spaces:");
        String input = scanner.nextLine();

        // Call the method to replace spaces and print the modified text
        String result = replaceSpaces(input);
        System.out.println("\nModified Text:\n" + result);

        scanner.close(); // Close the scanner
    }
}

