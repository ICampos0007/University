package com.solvd.university.student.humans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SecurityOfficer extends Person {
    private static final Logger logger = (Logger) LogManager.getLogger(SecurityOfficer.class);
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
