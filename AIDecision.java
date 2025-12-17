package model;

public class AIDecision {
    private String gender;
    private boolean approved;

    public AIDecision(String gender, boolean approved) {
        this.gender = gender;
        this.approved = approved;
    }

    public String getGender() {
        return gender;
    }

    public boolean isApproved() {
        return approved;
    }
}