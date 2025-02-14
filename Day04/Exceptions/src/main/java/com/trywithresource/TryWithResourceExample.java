package com.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {
    public static void main(String[] args) {
        // File path
        String filePath = "info.txt";

        // Using try-with-resources to ensure automatic resource closure
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line = bufferedReader.readLine(); // Read the first line

            if (line != null) {
                System.out.println("First line of file: " + line);
            } else {
                System.out.println("File is empty!");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
