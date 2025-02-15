package com.advancejunitpracticeproblems;

public class PasswordValidator {

    // Method to validate password
    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false; // Must be at least 8 characters long
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUpperCase && hasDigit; // Must have at least one uppercase letter and one digit
    }
}
