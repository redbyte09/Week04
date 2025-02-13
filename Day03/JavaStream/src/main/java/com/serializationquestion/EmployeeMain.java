package com.serializationquestion;

import java.util.ArrayList;
import java.util.List;
public class EmployeeMain {
        private static final String FILE_PATH = "C:\\Users\\saksh\\OneDrive\\Desktop\\Employee.txt";

        public static void main(String[] args) {
            // Create a list of employees
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(101, "Alica", "IT", 60000));
            employees.add(new Employee(102, "Bobby", "HR", 50000));
            employees.add(new Employee(103, "Chahat", "Finance", 55000));

            // Serialize (save) employees to a file
            EmployeeSerialization.saveEmployeesToFile(FILE_PATH, employees);

            // Deserialize (load) employees from the file
            List<Employee> loadedEmployees = EmployeeSerialization.loadEmployeesFromFile(FILE_PATH);

            // Display retrieved employees
            if (loadedEmployees != null) {
                System.out.println("\nRetrieved Employees:");
                for (Employee emp : loadedEmployees) {
                    System.out.println(emp);
                }
            }
        }
    }


