package com.coursemanagmentsystem;

public class AssignmentCourse extends CourseType {

    private  String startDate;

    public AssignmentCourse(String courseName,double fees,String startDate){
        super(courseName,fees);
        this.startDate=startDate;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public void display(){
        System.out.println("Start Date: "+startDate);
    }
}
