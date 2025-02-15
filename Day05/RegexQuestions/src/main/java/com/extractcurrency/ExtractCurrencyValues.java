package com.extractcurrency;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues {
    public static void extractCurrency(String text) {
        // Define regex pattern for currency values
        String regex = "\\$?\\d+\\.\\d{2}";

        // Compile regex
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extract and print matching values
        System.out.println("\nExtracted Currency Values:");
        boolean found = false;
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            found = true;
        }

        // If no match found
        if (!found) {
            System.out.println("No currency values found.");
        }
    }

    public static void main(String[] args) {
        // Example input
        String input = "The price is $45.99, and the discount is 10.50.";

        // Call function to extract currency values
        extractCurrency(input);
    }
}
