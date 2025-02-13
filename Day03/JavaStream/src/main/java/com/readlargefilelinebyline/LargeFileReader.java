package com.readlargefilelinebyline;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeFileReader {
    public static void readFileAndFilterErrors(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {  // Read file line by line
                if (line.toLowerCase().contains("error")) {  // Case-insensitive check
                    System.out.println(line);  // Print matching lines
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Main method to test with a sample file
    public static void main(String[] args) {
        String filePath = "C:\\Users\\saksh\\OneDrive\\Desktop\\largefile.txt";
        readFileAndFilterErrors(filePath);
    }
}

