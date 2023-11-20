package com.solvd.university.student;

public class Course extends Major {
    private String courseName;
    private int courseID;

    public Course(String majorName,String courseName, int courseID) {
        super(majorName);
        this.courseName = courseName;
        this.courseID = courseID;
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    @Override
    public String toString() {
        return "Major subject:" + getMajorName() + " course name: " + getCourseName();
    }
}
