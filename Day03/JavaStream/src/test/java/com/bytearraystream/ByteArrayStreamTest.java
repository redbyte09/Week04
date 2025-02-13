package com.bytearraystream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ByteArrayStreamTest {

    @Test
    void testImageConversion() throws IOException {
        String inputImagePath = "C:\\Users\\saksh\\OneDrive\\Desktop\\intellij-idea-logo.png";  // Ensure this image exists in the test directory
        String outputImagePath = "C:\\Users\\saksh\\OneDrive\\Desktop\\intellij-idea-logo.png";

        // Convert image to byte array
        byte[] imageBytes = ByteArrayStreamExample.convertImageToByteArray(inputImagePath);
        assertNotNull(imageBytes, "Byte array should not be null");
        assertTrue(imageBytes.length > 0, "Byte array should not be empty");

        // Convert byte array back to image
        ByteArrayStreamExample.convertByteArrayToImage(imageBytes, outputImagePath);

        // Verify if the files are identical
        assertTrue(ByteArrayStreamExample.verifyFilesAreIdentical(inputImagePath, outputImagePath),
                "The copied image should be identical to the original");


    }
}

