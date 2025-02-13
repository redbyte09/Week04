package com.datastream;

import org.junit.jupiter.api.Test;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static com.datastream.StudentDataStream.writeStudentData;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentDataStreamTest {
    @Test
    void testWriteAndReadStudentData() throws IOException {
        String testFile = "C:\\Users\\saksh\\OneDrive\\Desktop\\binaryfile.bin";

        // Write test student data
        writeStudentData(testFile, 103, "Charlie", 3.9);

        // Read back the data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(testFile))) {
            assertEquals(103, dis.readInt());
            assertEquals("Charlie", dis.readUTF());
            assertEquals(3.9, dis.readDouble(), 0.01);
        }
    }
}
