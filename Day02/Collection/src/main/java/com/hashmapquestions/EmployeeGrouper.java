package com.hashmapquestions;

import java.util.*;

class Employee {
    private String name;
    private String department;

    // Constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Override toString() to display employee name
    @Override
    public String toString() {
        return name;
    }
}

public class EmployeeGrouper {
    // Generic method to group employees by department
    public static <T extends Employee> Map<String, List<T>> groupByDepartment(List<T> employees) {
        Map<String, List<T>> departmentMap = new HashMap<>();

        for (T employee : employees) {
            departmentMap.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
        }

        return departmentMap;
    }

    public static void main(String[] args) {
        // Creating Employee List
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"),
                new Employee("David", "Finance"),
                new Employee("Eve", "IT")
        );

        // Group employees by department
        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        // Print the result
        for (Map.Entry<String, List<Employee>> entry : groupedEmployees.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

