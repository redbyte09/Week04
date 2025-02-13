package com.filehandlingquestions;

import java.io.*;

public class FileCopy {
    public static void copyFile(String sourceFile, String destinationFile) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File file = new File(sourceFile);
            if (!file.exists()) {
                throw new FileNotFoundException("Source file does not exist");
            }

            fis = new FileInputStream(file);
            fos = new FileOutputStream(destinationFile);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully to " + destinationFile);

        } catch (IOException e) {
            throw new RuntimeException("An error occurred while copying file: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }


    }
}
