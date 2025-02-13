import com.filehandlingquestions.FileCopy;
import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class FileCopyTest {

    private static final String SOURCE_FILE = "test_source.txt";
    private static final String DESTINATION_FILE = "test_destination.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Create a sample source file with test content
        FileWriter writer = new FileWriter(SOURCE_FILE);
        writer.write("Hello, this is a test file.\nFile handling in Java is interesting!");
        writer.close();
    }

    @Test
    void testFileCopySuccess() {
        // Call the file copy method
        FileCopy.copyFile(SOURCE_FILE, DESTINATION_FILE);

        // Check if destination file is created
        File destFile = new File(DESTINATION_FILE);
        assertTrue(destFile.exists(), "Destination file should exist after copying");

        // Verify content
        try (BufferedReader reader1 = new BufferedReader(new FileReader(SOURCE_FILE));
             BufferedReader reader2 = new BufferedReader(new FileReader(DESTINATION_FILE))) {

            String line1, line2;
            while ((line1 = reader1.readLine()) != null) {
                line2 = reader2.readLine();
                assertEquals(line1, line2, "File content should match");
            }
        } catch (IOException e) {
            fail("Exception occurred while verifying file content: " + e.getMessage());
        }
    }

    @Test
    void testFileNotFound() {
        // Try copying from a non-existent file
        String fakeSource = "non_existent.txt";

        Exception exception = assertThrows(RuntimeException.class, () -> {
            FileCopy.copyFile(fakeSource, DESTINATION_FILE);
        });

        // Check if the error message is appropriate
        assertTrue(exception.getMessage().contains("Source file does not exist"),
                "Error message should indicate missing source file");
    }

}
