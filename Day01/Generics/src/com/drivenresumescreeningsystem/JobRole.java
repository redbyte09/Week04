package com.drivenresumescreeningsystem;

public abstract class JobRole {
    private String candidateName;
    private int experienceYears;
    private double matchScore; // AI-driven score based on skills

    public JobRole(String candidateName, int experienceYears, double matchScore) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
        this.matchScore = matchScore;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public double getMatchScore() {
        return matchScore;
    }

    public abstract void displayRoleDetails();
}
