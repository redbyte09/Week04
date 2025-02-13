package com.serializationquestions;

import com.serializationquestion.Employee;
import com.serializationquestion.EmployeeSerialization;
import org.junit.jupiter.api.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeSerializationTest {

    private static final String TEST_FILE = "C:\\Users\\saksh\\OneDrive\\Desktop\\Employee.txt";

    @Test
    void testSaveAndLoadEmployees() {
        // Create test employee list
        List<Employee> testEmployees = new ArrayList<>();
        testEmployees.add(new Employee(201, "David", "Sales", 62000));
        testEmployees.add(new Employee(202, "Emma", "Marketing", 58000));

        // Serialize employees to file
        EmployeeSerialization.saveEmployeesToFile(TEST_FILE, testEmployees);

        // Deserialize employees from file
        List<Employee> loadedEmployees = EmployeeSerialization.loadEmployeesFromFile(TEST_FILE);

        // Assertions
        assertNotNull(loadedEmployees, "Loaded employees should not be null");
        assertEquals(testEmployees.size(), loadedEmployees.size(), "Size of employees should match");

        // Verify first employee's details
        assertEquals(testEmployees.get(0).getId(), loadedEmployees.get(0).getId(), "ID should match");
        assertEquals(testEmployees.get(0).getName(), loadedEmployees.get(0).getName(), "Name should match");
        assertEquals(testEmployees.get(0).getDepartment(), loadedEmployees.get(0).getDepartment(), "Department should match");
        assertEquals(testEmployees.get(0).getSalary(), loadedEmployees.get(0).getSalary(), "Salary should match");
    }

}

