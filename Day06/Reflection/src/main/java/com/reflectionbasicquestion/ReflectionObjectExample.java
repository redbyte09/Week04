package com.reflectionbasicquestion;

class Student {
    // Constructor
    public Student() {
        System.out.println("Student object created!");
    }

    // Method to display a message
    public void showMessage() {
        System.out.println("Hello from Student class!");
    }
}

public class ReflectionObjectExample {
    public static void main(String[] args) {
        try {
            // Get the Class object for Student
            Class<?> studentClass = Class.forName("Student");

            // Create an instance dynamically
            Object studentObject = studentClass.getDeclaredConstructor().newInstance();

            // Call the showMessage() method
            Student student = (Student) studentObject;
            student.showMessage();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
