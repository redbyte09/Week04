package com.advancereflectionquestions;

import java.lang.reflect.Field;
import java.util.Map;

// Create a simple class
class Person {
    public String name;
    public int age;
}

public class CustomObjectMapper {
    // Implement the toObject method
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            //  Create an instance of the class
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Set values using Reflection
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                // Get the field from the class
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true); // Allow modification if private
                field.set(obj, fieldValue);
            }

            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Create a Map with values
        Map<String, Object> data = Map.of(
                "name", "Sakshi Sharma",
                "age", 22
        );

        // Convert Map to a Person object
        Person person = toObject(Person.class, data);

        // Print the result
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}
