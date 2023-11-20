package com.solvd.university.student.humans;
import com.solvd.university.student.Department;

public class Professor extends Person {
    private final Department department;

    private final int professorID;

    public Professor(String firstName, String lastName, Department department, int professorID) {
        super(firstName, lastName);
        this.department = department;
        this.professorID = professorID;
    }

    public Department getDepartment() {
        return department;
    }

    public int getProfessorID() {
        return professorID;
    }

    @Override
    public String toString() {
        return "Professor: " + getFirstName() + " " + getLastName();
    }

}
