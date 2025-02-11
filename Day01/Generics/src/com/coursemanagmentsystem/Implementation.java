package com.coursemanagmentsystem;

import java.util.ArrayList;
import java.util.List;
public class Implementation {




        public static void main(String[] args) {
            Course<ExamCourse> examCourseManager = new Course<>();
            Course<AssignmentCourse> assignmentCourseManager = new Course<>();
            Course<ResearchCourse> researchCourseManager = new Course<>();

            // Creating courses
            ExamCourse examCourse = new ExamCourse("Mathematics", 5000, "2025-02-20");
            AssignmentCourse assignmentCourse = new AssignmentCourse("Java Project", 3000, "2025-03-10");
            ResearchCourse researchCourse = new ResearchCourse("AI Research", 7000, "2025-04-15");

            // Adding courses to respective managers
            examCourseManager.addCourse(examCourse);
            assignmentCourseManager.addCourse(assignmentCourse);
            researchCourseManager.addCourse(researchCourse);

            // Collecting all courses in a single list
            List<CourseType> allCourses = new ArrayList<>();
            allCourses.add(examCourse);
            allCourses.add(assignmentCourse);
            allCourses.add(researchCourse);

            // Displaying all courses dynamically
            System.out.println("Displaying all courses:");
            Course.displayAllCourses(allCourses);
        }
    }

