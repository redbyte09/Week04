package com.coursemanagmentsystem;

public abstract class CourseType {

    private String courseName;
    private double fees;

    public CourseType(String courseName, double fees){
        this.courseName=courseName;
        this.fees=fees;
    }

    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setFees(double fees){
        this.fees=fees;
    }

    public double getFees(){
        return fees;
    }
    public abstract void display();

}
