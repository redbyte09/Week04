package com.filehandlingquestions;



public class FileCopyRunner {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\saksh\\OneDrive\\Desktop\\Source.txt";
        String destinationFile = "C:\\Users\\saksh\\OneDrive\\Desktop\\Destination.txt";

        FileCopy.copyFile(sourceFile, destinationFile);
    }
}
