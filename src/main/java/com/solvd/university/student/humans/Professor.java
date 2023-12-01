package com.solvd.university.student.humans;

public class Professor extends Person {

    public enum TeachingStatus {
        TEACHING,
        NOT_TEACHING
    }

    private TeachingStatus teachingStatus;

    public Professor(String firstName, String lastName, TeachingStatus teachingStatus) {
        super(firstName, lastName);
        this.teachingStatus = teachingStatus;
    }

    public TeachingStatus getTeachingStatus() {
        return teachingStatus;
    }

    public void setTeachingStatus(TeachingStatus teachingStatus) {
        this.teachingStatus = teachingStatus;
    }

    @Override
    public String toString() {
        return "Professor: " + getFirstName() + " " + getLastName();
    }
}