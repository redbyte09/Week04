package com.advancereflectionquestions;

import java.lang.reflect.Field;

// Create a simple class
class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class JsonConverter {
    // Implement the toJson method
    public static String toJson(Object obj) {
        try {
            Class<?> objClass = obj.getClass();
            StringBuilder json = new StringBuilder("{");

            Field[] fields = objClass.getDeclaredFields(); // Get all fields
            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true); // Allow access to private fields

                String fieldName = fields[i].getName();
                Object fieldValue = fields[i].get(obj);

                json.append("\"").append(fieldName).append("\": ");

                if (fieldValue instanceof String) {
                    json.append("\"").append(fieldValue).append("\"");
                } else {
                    json.append(fieldValue);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }
            }

            json.append("}");
            return json.toString();

        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
    }

    public static void main(String[] args) {
        // Create an object
        Person person = new Person("Sakshi Sharma", 22);

        // Convert it to JSON format
        String jsonString = toJson(person);

        // Print the result
        System.out.println(jsonString);
    }
}

