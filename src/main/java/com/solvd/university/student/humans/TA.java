package com.solvd.university.student.humans;

import com.solvd.university.student.Department;

public class TA extends Person{
    private final Department department;

    public TA(String firstName, String lastName, Department department){
        super(firstName,lastName);
        this.department = department;
    }
    public Department getDepartment() {
        return department;
    }
    @Override
    public String toString() {
        return "TA: " + getFirstName() + " " + getLastName()+ " "+ getDepartment().getDepartmentName();
    }
}

