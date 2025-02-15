package com.allcapitalizedwords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllCapitalizedWord {

    // Method to extract and print all capitalized words from a given string
    public static void extractCapitalizedWord(String str) {
        // Regex pattern: Matches words starting with an uppercase letter (A-Z) followed by lowercase letters (a-z)
        String text = "\\b[A-Z][a-z]*\\b";

        // Compile the pattern
        Pattern pattern = Pattern.compile(text);
        Matcher matcher = pattern.matcher(str);

        System.out.println("\nExtracted Capitalized Words:");
        boolean found = false;

        // Loop through all matches and print them
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            found = true;
        }

        // If no capitalized words found, print a message
        if (!found) {
            System.out.println("No Capitalized Words Found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();

        // Call method to extract capitalized words
        extractCapitalizedWord(input);

        scanner.close();
    }
}
