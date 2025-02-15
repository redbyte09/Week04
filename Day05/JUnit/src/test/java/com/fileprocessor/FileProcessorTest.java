package com.fileprocessor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private final FileProcessor fileProcessor = new FileProcessor();
    private final String testFilename = "testfile.txt";

    // Set up: Delete the test file before each test
    @BeforeEach
    void setup() {
        File file = new File(testFilename);
        if (file.exists()) {
            file.delete();
        }
    }

    // Test writing and reading from a file
    @Test
    void testWriteAndReadFromFile() throws IOException {
        String content = "Hello, JUnit File Testing!";

        // Write content to file
        fileProcessor.writeToFile(testFilename, content);

        // Read content from file
        String result = fileProcessor.readFromFile(testFilename);

        // Verify that the content is correctly written and read
        assertEquals(content, result, "File content should match the written content");

        // Verify that the file exists
        assertTrue(new File(testFilename).exists(), "File should exist after writing");
    }

    // Test IOException when file does not exist
    @Test
    void testFileNotFoundException() {
        Exception exception = assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile("non_existent_file.txt");
        });

        // Verify that the correct exception message is thrown
        assertTrue(exception.getMessage().contains("non_existent_file"), "Exception should mention missing file");
    }

    // Clean up: Delete the test file after each test
    @AfterEach
    void cleanup() {
        File file = new File(testFilename);
        if (file.exists()) {
            file.delete();
        }
    }
}
