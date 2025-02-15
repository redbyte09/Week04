package com.censorbadword;

import java.util.Scanner;

public class CensorBadWords {
    // Method to replace bad words with ****
    public static String censorText(String text) {
        // Define bad words (Add more if needed)
        String[] badWords = {"damn", "stupid"};

        // Replace each bad word with ****
        for (String word : badWords) {
            text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Call the method to censor bad words
        String result = censorText(input);
        System.out.println("\nCensored Sentence:\n" + result);

        scanner.close();
    }
}

