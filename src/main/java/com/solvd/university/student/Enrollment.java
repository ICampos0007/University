package com.solvd.university.student;

import com.solvd.university.student.humans.Student;

public class Enrollment extends Clubs {
    private Student student;
    private Course course;

    public Enrollment(String clubName,Student student, Course course) {
        super(clubName);
        this.student = student;
        this.course = course;
    }

    // Getters and Setters
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "This Student: " + getStudent().getFirstName() + " is in the " + getClubName();
    }
}
