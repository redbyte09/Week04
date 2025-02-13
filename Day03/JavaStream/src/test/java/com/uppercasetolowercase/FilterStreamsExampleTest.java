package com.uppercasetolowercase;


import com.uppercsetolowercase.FilterStreamsExample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public  class FilterStreamsExampleTest {
    @Test
    void testConvertUppercaseToLowercase() throws IOException {
        String testInputFile = "test_input.txt";
        String testOutputFile = "test_output.txt";

        // Create a test file with uppercase content
        Files.write(Paths.get(testInputFile), "HELLO WORLD".getBytes());

        // Call the conversion method
        FilterStreamsExample.convertUppercaseToLowercase(testInputFile, testOutputFile);

        // Read output file and check conversion
        String outputContent = new String(Files.readAllBytes(Paths.get(testOutputFile)));
        assertEquals("hello world\n", outputContent);


    }
}
