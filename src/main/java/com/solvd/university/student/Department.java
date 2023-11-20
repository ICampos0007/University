package com.solvd.university.student;

public class Department<T> {
    private T departmentName;

    public Department(T departmentName) {
        this.departmentName = departmentName;
    }

    // Getters and Setters
    public T getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(T departmentName) {
        this.departmentName = departmentName;
    }
}