package com.solvd.university.student.humans;


public class SecurityOfficer extends Person {

    private final int securityID;

    public SecurityOfficer(String firstName, String lastName, int securityID) {
        super(firstName, lastName);
        this.securityID = securityID;
    }

    public int getSecurityID() {
        return securityID;
    }

    @Override
    public String toString() {
        return "Security: " + getFirstName() + " " + getLastName() + " is patrolling the campus.";
    }
}
