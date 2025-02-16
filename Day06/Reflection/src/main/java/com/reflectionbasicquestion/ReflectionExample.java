package com.reflectionbasicquestion;

import java.lang.reflect.Field;

class Person {
    // Private field
    private int age;

    // Constructor
    public Person(int age) {
        this.age = age;
    }

    // Method to display age
    public void showAge() {
        System.out.println("Age: " + age);
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Create an object of Person with age 25
            Person person = new Person(25);
            person.showAge(); // Show original age

            // Get the Class object
            Class<?> personClass = person.getClass();

            // Access the private field "age"
            Field ageField = personClass.getDeclaredField("age");
            ageField.setAccessible(true); // Allow access to private field

            // Modify the private field's value
            ageField.set(person, 30);

            // Retrieve and print the updated value
            System.out.println("Updated Age: " + ageField.get(person));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
