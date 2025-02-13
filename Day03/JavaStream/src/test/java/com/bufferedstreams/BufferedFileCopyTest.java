package com.bufferedstreams;

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class BufferedFileCopyTest {

    private static final String SOURCE_FILE = "C:\\Users\\saksh\\OneDrive\\Desktop\\Source.txt";
    private static final String D_BUFFERED = "C:\\Users\\saksh\\OneDrive\\Desktop\\Destination.txt";
    private static final String D_UNBUFFERED = "C:\\Users\\saksh\\OneDrive\\Desktop\\UserInput.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Create a large test file (~1MB for testing, scale up for real tests)
        try (FileOutputStream fos = new FileOutputStream(SOURCE_FILE)) {
            byte[] data = new byte[1024 * 1024]; // 1MB file
            fos.write(data);
        }
    }

    @Test
    void testCopyUsingBufferedStreams() {
        long timeBuffered = BufferedFileCopy.copyUsingBufferedStreams(SOURCE_FILE, D_BUFFERED);

        // Check if destination file exists
        File destFile = new File(D_BUFFERED);
        assertTrue(destFile.exists(), "Buffered copy should create a destination file");

        // Verify content matches
        assertTrue(compareFiles(SOURCE_FILE, D_BUFFERED), "Buffered copy should have identical content");

        System.out.println("Buffered Copy Time: " + timeBuffered + " ns");
    }

    @Test
    void testCopyUsingUnbufferedStreams() {
        long timeUnbuffered = BufferedFileCopy.copyUsingUnbufferedStreams(SOURCE_FILE, D_UNBUFFERED);

        // Check if destination file exists
        File destFile = new File(D_UNBUFFERED);
        assertTrue(destFile.exists(), "Unbuffered copy should create a destination file");

        // Verify content matches
        assertTrue(compareFiles(SOURCE_FILE, D_UNBUFFERED), "Unbuffered copy should have identical content");

        System.out.println("Unbuffered Copy Time: " + timeUnbuffered + " ns");
    }

    @Test
    void testPerformanceComparison() {
        long timeBuffered = BufferedFileCopy.copyUsingBufferedStreams(SOURCE_FILE, D_BUFFERED);
        long timeUnbuffered = BufferedFileCopy.copyUsingUnbufferedStreams(SOURCE_FILE, D_UNBUFFERED);

        System.out.println("Buffered Time: " + timeBuffered + " ns");
        System.out.println("Unbuffered Time: " + timeUnbuffered + " ns");

        assertTrue(timeBuffered < timeUnbuffered, "Buffered stream should be faster than unbuffered stream");
    }

    @Test
    void testFileNotFound() {
        String fakeSource = "non_existent.txt";

        Exception exception = assertThrows(RuntimeException.class, () -> {
            BufferedFileCopy.copyUsingBufferedStreams(fakeSource, D_BUFFERED);
        });

        assertTrue(exception.getMessage().contains("Source file does not exist"),
                "Error message should indicate missing source file");
    }

    @AfterEach
    void tearDown() {
        // Delete test files
        new File(SOURCE_FILE).delete();
        new File(D_BUFFERED).delete();
        new File(D_UNBUFFERED).delete();
    }

    // Helper method to compare file contents
    private boolean compareFiles(String file1, String file2) {
        try (BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream(file1));
             BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream(file2))) {

            int byte1, byte2;
            while ((byte1 = bis1.read()) != -1) {
                byte2 = bis2.read();
                if (byte1 != byte2) return false;
            }
            return bis2.read() == -1; // Ensure both files end together

        } catch (IOException e) {
            return false;
        }
    }
}
