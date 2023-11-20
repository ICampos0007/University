package com.solvd.university.student;

public abstract class Major {
    private String majorName;

    public Major(String majorName) {

        this.majorName = majorName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        if (majorName == null || majorName.contains("!@#$%^&*()_+-")) {
            throw new MajorInvalidException();
        }
        this.majorName = majorName;
    }

    public abstract String toString();
}
