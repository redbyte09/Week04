package com.coursemanagmentsystem;

import java.util.ArrayList;
import java.util.List;
public class Course<T extends CourseType> {
        private List<T> courses = new ArrayList<>();

        public void addCourse(T course) {
            courses.add(course);
        }

        public List<T> getCourses() {
            return courses;
        }

        // Display all courses using Wildcards
        public static void displayAllCourses(List<? extends CourseType> courseList) {
            for (CourseType course : courseList) {
                course.display();
                System.out.println("-------------------------");
            }
        }
    }
