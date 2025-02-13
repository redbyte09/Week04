package com.uppercsetolowercase;

import java.io.*;

public class FilterStreamsExample {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\saksh\\OneDrive\\Desktop\\input.txt";
        String outputFile = "C:\\Users\\saksh\\OneDrive\\Desktop\\Output.txt";

        try {
            convertUppercaseToLowercase(inputFile, outputFile);
            System.out.println("File conversion completed successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to read from a file, convert uppercase to lowercase, and write to another file
    public static void convertUppercaseToLowercase(String inputFile, String outputFile) throws IOException {
        // Using BufferedReader for efficient reading and FileReader for character stream reading
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            // Read each line
            while ((line = reader.readLine()) != null) {
                // Convert to lowercase and write to output file
                writer.write(line.toLowerCase());
                // Add a new line for each input line
                writer.newLine();
            }
        }
    }
}
