package com.readinputfromconsole;

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class UserInputToFileTest {

    private static final String TEST_FILE = "C:\\Users\\saksh\\OneDrive\\Desktop\\User Data.txt";

    @Test
    void testSaveUserInputToFile() throws IOException {
        // Simulate user input
        String simulatedInput = "Sakshi\n22\nJava\n";
        BufferedReader reader = new BufferedReader(new StringReader(simulatedInput));

        // Call method
        UserInputToFile.saveUserInputToFile(TEST_FILE, reader);

        // Check if file is created
        File file = new File(TEST_FILE);
        assertTrue(file.exists(), "File should be created after saving user input");

        // Verify file content
        String expectedContent = "Name: Sakshi\nAge: 22\nFavorite Programming Language: Java\n";
        String actualContent = readFileContent(TEST_FILE);
        assertEquals(expectedContent, actualContent, "File content should match user input");
    }

    // Corrected method to read file content
    private String readFileContent(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n"); // Ensure newline for proper comparison
            }
        }
        return content.toString();
    }

    @AfterEach
    void tearDown() {
        // Delete test file after test execution
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete();
        }
    }
}
