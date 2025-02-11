package com.drivenresumescreeningsystem;


import java.util.ArrayList;
import java.util.List;
public class Resume <T extends JobRole>{

    private List<T> resumeList = new ArrayList<>();

    public void addResume(T resume) {
        resumeList.add(resume);
    }

    public List<T> getResumes() {
        return resumeList;
    }

    public void displayResumes() {
        for (T resume : resumeList) {
            resume.displayRoleDetails();
            System.out.println();
        }
    }

    // Wildcard method to process different job roles dynamically
    public static void processResumes(List<? extends JobRole> resumes) {
        System.out.println("Processing AI-Driven Resume Screening...");
        for (JobRole resume : resumes) {
            resume.displayRoleDetails();
            System.out.println();
        }
    }
}
