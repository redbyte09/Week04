package com.datastream;

import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\saksh\\OneDrive\\Desktop\\binaryfile.bin";

        // Writing student details to the file
        try {
            writeStudentData(fileName, 101, "Alica", 3.8);
            writeStudentData(fileName, 102, "Bobby", 3.5);
            System.out.println("Student data written successfully!");
        } catch (IOException e) {
            System.err.println("Error writing data: " + e.getMessage());
        }

        // Reading student details from the file
        try {
            readStudentData(fileName);
        } catch (IOException e) {
            System.err.println("Error reading data: " + e.getMessage());
        }
    }

    // Method to write student details to a binary file
    public static void writeStudentData(String fileName, int rollNo, String name, double gpa) throws IOException {
        // Use "false" in FileOutputStream to overwrite the file instead of appending
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName, false))) {
            dos.writeInt(rollNo);  // Writing roll number
            dos.writeUTF(name);    // Writing student name
            dos.writeDouble(gpa);  // Writing GPA
        }
    }

    // Method to read student details from a binary file
    public static void readStudentData(String fileName) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("Student Details:");
            while (dis.available() > 0) { // Check if more data is available
                int rollNo = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNo + ", Name: " + name + ", GPA: " + gpa);
            }
        }
    }
}