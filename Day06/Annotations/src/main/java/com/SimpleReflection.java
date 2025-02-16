package com;

import java.lang.reflect.*;
import java.util.Scanner;

public class SimpleReflection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for class name
        System.out.print("Enter a class name ");
        String className = scanner.nextLine();
        scanner.close();

        try {
            // Load class dynamically
            Class<?> cls = Class.forName(className);

            // Print class name
            System.out.println("\nClass: " + cls.getName());

            // Print fields
            System.out.println("\nFields:");
            for (Field field : cls.getDeclaredFields()) {
                System.out.println("  " + field.getName());
            }

            // Print methods
            System.out.println("\nMethods:");
            for (Method method : cls.getDeclaredMethods()) {
                System.out.println("  " + method.getName());
            }

            // Print constructors
            System.out.println("\nConstructors:");
            for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                System.out.println("  " + constructor.getName());
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found! Please enter a valid class name.");
        }
    }
}

