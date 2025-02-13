package com.serializationquestion;

import java.io.*;
import java.util.List;

public class EmployeeSerialization {
    // Method to save employees to a file using serialization
    public static void saveEmployeesToFile(String filePath, List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(employees); // Serialize the list of employees
            System.out.println("Employees saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving employees: " + e.getMessage());
        }
    }

    // Method to load employees from a file using deserialization
    public static List<Employee> loadEmployeesFromFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<Employee>) ois.readObject(); // Deserialize the list of employees
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading employees: " + e.getMessage());
            return null;
        }
    }
}
