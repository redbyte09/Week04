package com.drivenresumescreeningsystem;

public class DataScientist extends JobRole{
    private String primaryTool;

    public DataScientist(String candidateName, int experienceYears, double matchScore, String primaryTool) {
        super(candidateName, experienceYears, matchScore);
        this.primaryTool = primaryTool;
    }

    public String getPrimaryTool() {
        return primaryTool;
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Data Scientist: " + getCandidateName());
        System.out.println("Experience: " + getExperienceYears() + " years");
        System.out.println("Match Score: " + getMatchScore() + "%");
        System.out.println("Primary Tool: " + primaryTool);
    }
}
