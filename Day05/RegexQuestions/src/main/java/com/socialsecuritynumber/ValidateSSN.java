package com.socialsecuritynumber;

import java.util.regex.*;

public class ValidateSSN {
    public static void validateSSN(String text) {
        // Define regex pattern for SSN
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        // Compile regex
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Check for SSN matches
        boolean found = false;
        while (matcher.find()) {
            System.out.println("matcher.group() is a valid SSN.");
            found = true;
        }

        // If no valid SSN found
        if (!found) {
            System.out.println(" No valid SSN found.");
        }
    }

    public static void main(String[] args) {
        // Example input
        String input = "My SSN is 123-45-6789.";

        // Call function to validate SSN
        validateSSN(input);
    }
}

