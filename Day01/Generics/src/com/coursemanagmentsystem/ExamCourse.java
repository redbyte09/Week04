package com.coursemanagmentsystem;

public class ExamCourse extends CourseType {
    private String startDate;

    public ExamCourse(String courseName, double fees, String startDate) {
        super(courseName,fees);
        this.startDate=startDate;

    }

    public void setStartDate(String startDate){
        this.startDate=startDate;
    }
    public String getStartDate(){
        return startDate;
    }

    public void display(){
        System.out.println("Course name is"+getCourseName());
        System.out.println("Fees is"+getFees());
        System.out.println("StartDate is"+startDate);
    }
}
