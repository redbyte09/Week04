package com.drivenresumescreeningsystem;


import java.util.ArrayList;
import java.util.List;
public class Implementation {
    public static void main(String[] args) {
        // Creating resume screening managers
        Resume<SoftwareEngineer> seResumeScreen = new Resume<>();
        Resume<DataScientist> dsResumeScreen = new Resume<>();
        Resume<ProductManager> pmResumeScreen = new Resume<>();

        //
        // Adding resumes
        SoftwareEngineer se1 = new SoftwareEngineer("Adarsh", 5, 85.5, "Java");
        SoftwareEngineer se2 = new SoftwareEngineer("Bobby", 3, 78.0, "Python");

        DataScientist ds1 = new DataScientist("Chahat", 4, 88.2, "TensorFlow");
        ProductManager pm1 = new ProductManager("Dev", 6, 90.1, "E-commerce");

        seResumeScreen.addResume(se1);
        seResumeScreen.addResume(se2);

        dsResumeScreen.addResume(ds1);
        pmResumeScreen.addResume(pm1);

        // Displaying resumes
        System.out.println("Software Engineer Resumes:");
        seResumeScreen.displayResumes();

        System.out.println("Data Scientist Resumes:");
        dsResumeScreen.displayResumes();

        System.out.println("Product Manager Resumes:");
        pmResumeScreen.displayResumes();

        // Using wildcard method to process all resumes together
        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(se1);
        allResumes.add(se2);
        allResumes.add(ds1);
        allResumes.add(pm1);

        Resume.processResumes(allResumes);
    }
}
