package com.intermediatelevelquestions;

import java.lang.reflect.Field;

class Configuration {
    // Private static field
    private static String API_KEY = "12345-DEFAULT-KEY";

    // Method to print the API_KEY
    public static void printApiKey() {
        System.out.println("API_KEY: " + API_KEY);
    }
}

public class ReflectionStaticFieldExample {
    public static void main(String[] args) {
        try {
            // Print the original API_KEY
            Configuration.printApiKey();

            // Get the Class object
            Class<?> configClass = Configuration.class;

            // Access the private static field "API_KEY"
            Field apiKeyField = configClass.getDeclaredField("API_KEY");
            apiKeyField.setAccessible(true); // Allow access to private field

            //  Modify the static field's value
            apiKeyField.set(null, "67890-NEW-KEY");  // Use 'null' for static fields

            // Print the updated API_KEY
            Configuration.printApiKey();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

