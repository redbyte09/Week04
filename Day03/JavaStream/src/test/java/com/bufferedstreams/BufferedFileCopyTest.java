package com.bufferedstreams;



import java.io.*;

public class BufferedFileCopy {

    // Method to copy a file using Buffered Streams
    public static long copyUsingBufferedStreams(String sourcePath, String destinationPath) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationPath))) {

            byte[] buffer = new byte[4096]; // 4KB buffer
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            throw new RuntimeException("Error copying file using buffered streams: " + e.getMessage());
        }

        return System.nanoTime() - startTime; // Return execution time in nanoseconds
    }

    // Method to copy a file using Unbuffered Streams (for comparison)
    public static long copyUsingUnbufferedStreams(String sourcePath, String destinationPath) {
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destinationPath)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

        } catch (IOException e) {
            throw new RuntimeException("Error copying file using unbuffered streams: " + e.getMessage());
        }

        return System.nanoTime() - startTime; // Return execution time in nanoseconds
    }


}
