package com.readinputfromconsole;

import java.io.*;

public class UserInputToFile {

    // Method to read user input from the console and write it to a file
    public static void saveUserInputToFile(String filePath, BufferedReader reader) {
        try (FileWriter writer = new FileWriter(filePath)) {
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Writing to file
            writer.write("Name: " + name );
            System.out.println();
            writer.write("Age: " + age );
            System.out.println();
            writer.write("Favorite Programming Language: " + language );
            System.out.println();

            System.out.println("User details saved successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        String filePath = "C:\\Users\\saksh\\OneDrive\\Desktop\\User Data.txt";

        // Using BufferedReader for user input
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            saveUserInputToFile(filePath, reader);
        } catch (IOException e) {
            System.out.println("Error reading user input: " + e.getMessage());
        }
    }
}

