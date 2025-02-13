package com.bytearraystream;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ByteArrayStreamExample {
    public static void main(String[] args) {
        String inputImagePath = "C:\\Users\\saksh\\OneDrive\\Desktop\\intellij-idea-logo.png";
        String outputImagePath = "C:\\Users\\saksh\\OneDrive\\Desktop\\intellij-idea-logo.png";

        try {
            //  Convert image to byte array
            byte[] imageBytes = convertImageToByteArray(inputImagePath);

            // Write byte array back to an image file
            convertByteArrayToImage(imageBytes, outputImagePath);

            //  Verify if both files are identical
            if (verifyFilesAreIdentical(inputImagePath, outputImagePath)) {
                System.out.println("Success: The copied image is identical to the original.");
            } else {
                System.out.println("Error: The copied image is not identical to the original.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to convert an image file to a byte array
    public static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileInputStream fis = new FileInputStream(imagePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray(); // Return byte array of image
        }
    }

    // Method to convert a byte array back to an image file
    public static void convertByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    // Method to verify if two image files are identical
    public static boolean verifyFilesAreIdentical(String filePath1, String filePath2) throws IOException {
        byte[] file1Bytes = Files.readAllBytes(new File(filePath1).toPath());
        byte[] file2Bytes = Files.readAllBytes(new File(filePath2).toPath());
        return Arrays.equals(file1Bytes, file2Bytes); // Compare both byte arrays
    }
}
