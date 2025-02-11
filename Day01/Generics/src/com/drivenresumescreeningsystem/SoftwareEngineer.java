package com.drivenresumescreeningsystem;

public class SoftwareEngineer extends JobRole{
    private String programmingLanguage;

    public SoftwareEngineer(String candidateName, int experienceYears, double matchScore, String programmingLanguage) {
        super(candidateName, experienceYears, matchScore);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Software Engineer: " + getCandidateName());
        System.out.println("Experience: " + getExperienceYears() + " years");
        System.out.println("Match Score: " + getMatchScore() + "%");
        System.out.println("Primary Language: " + programmingLanguage);
    }
}
