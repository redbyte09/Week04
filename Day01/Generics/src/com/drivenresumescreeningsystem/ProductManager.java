package com.drivenresumescreeningsystem;

public class ProductManager extends JobRole{
    private String domainExpertise;

    public ProductManager(String candidateName, int experienceYears, double matchScore, String domainExpertise) {
        super(candidateName, experienceYears, matchScore);
        this.domainExpertise = domainExpertise;
    }

    public String getDomainExpertise() {
        return domainExpertise;
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Product Manager: " + getCandidateName());
        System.out.println("Experience: " + getExperienceYears() + " years");
        System.out.println("Match Score: " + getMatchScore() + "%");
        System.out.println("Domain Expertise: " + domainExpertise);
    }
}
