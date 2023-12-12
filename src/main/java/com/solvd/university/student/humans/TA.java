package com.solvd.university.student.humans;

import com.solvd.university.student.Department;
import java.time.LocalDateTime;

public class TA extends Person {
    private final Department department;
    private TutoringStatus tutoringStatus;
    private LocalDateTime tutoringStatusLastUpdated;

    public TA(String firstName, String lastName, Department department, TutoringStatus tutoringStatus) {
        super(firstName, lastName);
        this.department = department;
        this.tutoringStatus = tutoringStatus;
        this.tutoringStatusLastUpdated = LocalDateTime.now();
    }

    public Department getDepartment() {
        return department;
    }

    public TutoringStatus getTutoringStatus() {
        return tutoringStatus;
    }

    public LocalDateTime getTutoringStatusLastUpdated() {
        return tutoringStatusLastUpdated;
    }

    public void setTutoringStatus(TutoringStatus tutoringStatus) {
        this.tutoringStatus = tutoringStatus;
        this.tutoringStatusLastUpdated = LocalDateTime.now();
    }

    public enum TutoringStatus {
        CURRENTLY_TUTORING,
        NOT_TUTORING
    }

    @Override
    public String toString() {
        return "TA: " + getFirstName() + " " + getLastName() + " " +
                getDepartment().getDepartmentName() + " - Tutoring Status: " + getTutoringStatus() +
                " - Last Updated: " + getTutoringStatusLastUpdated();
    }
}