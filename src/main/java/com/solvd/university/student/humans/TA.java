package com.solvd.university.student.humans;

import com.solvd.university.student.Department;

public class TA extends Person {
    public enum TutoringStatus {
        CURRENTLY_TUTORING,
        NOT_TUTORING
    }
    private final Department department;
    private final TutoringStatus tutoringStatus;

    public TA(String firstName, String lastName, Department department, TutoringStatus tutoringStatus) {
        super(firstName, lastName);
        this.department = department;
        this.tutoringStatus = tutoringStatus;
    }

    public Department getDepartment() {
        return department;
    }

    public TutoringStatus getTutoringStatus() {
        return tutoringStatus;
    }

    @Override
    public String toString() {
        return "TA: " + getFirstName() + " " + getLastName() + " " +
                getDepartment().getDepartmentName() + " - Tutoring Status: " + getTutoringStatus();
    }
}