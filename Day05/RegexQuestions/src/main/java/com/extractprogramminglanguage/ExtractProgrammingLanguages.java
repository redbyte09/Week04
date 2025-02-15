package com.extractprogramminglanguage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguages {
    public static void extractLanguages(String text) {
        // Define regex pattern for programming languages
        String regex = "\\b(Java|Python|JavaScript|Go)\\b";

        // Compile regex
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extract and print matching words
        System.out.println("\nExtracted Programming Languages:");
        boolean found = false;
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            found = true;
        }

        // If no match found
        if (!found) {
            System.out.println("No programming languages found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example input
        String input = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Call function to extract programming languages
        extractLanguages(input);

        scanner.close();
    }
}
