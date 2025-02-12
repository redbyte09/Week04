package com.hashmapquestions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class EmployeeGrouperTest {

    @Test
    public void testGroupByDepartment_BasicCase() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> expected = new HashMap<>();
        expected.put("HR", Arrays.asList(new Employee("Alice", "HR"), new Employee("Carol", "HR")));
        expected.put("IT", Arrays.asList(new Employee("Bob", "IT")));

        assertEquals(expected, EmployeeGrouper.groupByDepartment(employees));
    }
}
