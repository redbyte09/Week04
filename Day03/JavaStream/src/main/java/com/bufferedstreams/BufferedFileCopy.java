package com.bufferedstreams;



import java.io.*;

public class BufferedFileCopy {

    // Method to copy file using Buffered Streams
    public static long copyUsingBufferedStreams(String sourcePath, String destinationPath) {
        long startTime = System.nanoTime(); // Start timing

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationPath))) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            throw new RuntimeException("Error copying file using buffered streams: " + e.getMessage());
        }

        return System.nanoTime() - startTime; // Return execution time
    }

    // Method to copy file using Unbuffered Streams (for comparison)
    public static long copyUsingUnbufferedStreams(String sourcePath, String destinationPath) {
        long startTime = System.nanoTime(); // Start timing

        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destinationPath)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

        } catch (IOException e) {
            throw new RuntimeException("Error copying file using unbuffered streams: " + e.getMessage());
        }

        return System.nanoTime() - startTime; // Return execution time
    }

    // Main method for execution
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\saksh\\OneDrive\\Desktop\\Source.txt";
        String dBuffered = "C:\\Users\\saksh\\OneDrive\\Desktop\\Destination.txt";
        String dUnbuffered = "C:\\Users\\saksh\\OneDrive\\Desktop\\UserInput.txt";

        File file = new File(sourceFile);
        if (!file.exists()) {
            System.out.println("Source file does not exist. Please provide a valid file.");
            return;
        }

        // Measure and compare performance
        long timeBuffered = copyUsingBufferedStreams(sourceFile, dBuffered);
        long timeUnbuffered = copyUsingUnbufferedStreams(sourceFile, dUnbuffered);

        System.out.println("Buffered Copy Time: " + timeBuffered + " ns");
        System.out.println("Unbuffered Copy Time: " + timeUnbuffered + " ns");

        // Efficiency analysis
        if (timeBuffered < timeUnbuffered) {
            System.out.println("Buffered Streams were faster!");
        } else {
            System.out.println("Unbuffered Streams were faster (unexpected).");
        }
    }
}
