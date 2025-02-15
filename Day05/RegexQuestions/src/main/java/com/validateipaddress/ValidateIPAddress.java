package com.validateipaddress;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    // Method to validate IP address
    public static boolean isValidIP(String ip) {
        // Regular expression to match a valid IPv4 address
        String regex = "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

        return Pattern.matches(regex, ip);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.println("Enter an IP address:");
        String ip = scanner.nextLine();

        // Check if the IP is valid
        if (isValidIP(ip)) {
            System.out.println("\nValid IP Address ✅");
        } else {
            System.out.println("\nInvalid IP Address ❌");
        }

        scanner.close();
    }
}
