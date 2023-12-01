package com.solvd.university.student.humans;

import com.solvd.university.student.Clubs;
import com.solvd.university.student.ScholarShip;
import com.solvd.university.student.interfaces.*;
import com.solvd.university.student.interfaces.IPrint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Student extends Person implements IStudent, IRelax, IPrepare, ITutor, IPrint {
    private static final Logger logger = LogManager.getLogger(Student.class);
    private final int studentID;
    private final double examScore;
    private ScholarShip scholarship;
    private Clubs clubs;

    public Student(String firstName, String lastName, int studentID, double examScore) {
        super(firstName, lastName);
        this.studentID = studentID;
        this.examScore = examScore;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getExamScore() {
        return examScore;
    }

    public ScholarShip getScholarship() {
        return scholarship;
    }

    public void setScholarship(ScholarShip scholarship) {
        this.scholarship = scholarship;
    }

    public void setClubs(Clubs clubs) {
        this.clubs = clubs;
    }

    @Override
    public String toString() {
        return "Student: " + getFirstName() + " " + getLastName();
    }

    @Override
    public void studying(Scanner scanner) {
        logger.info(getFirstName() + " is studying.");
    }

    @Override
    public void reading(Scanner scanner) {
        logger.info(getFirstName() + " is reading.");
    }

    @Override
    public void homework(Scanner scanner) {

        logger.info(getFirstName() + " is doing homework.");
    }

    @Override
    public void nap(Scanner scanner) {
        logger.info(getFirstName() + " has decided to sleep.");
    }

    @Override
    public void eat(Scanner scanner) {
        logger.info(getFirstName() + " has decided to go eat.");
    }

    @Override
    public void socialize(Scanner scanner) {
        logger.info(getFirstName() + " has decided to go socialize with fellow students");
    }

    @Override
    public void review(Scanner scanner) {
        logger.info(getFirstName() + " has decided to review the lecture after class.");
    }
    @Override
    public void flashCards(Scanner scanner) {
        logger.info(getFirstName() + " has decided to make flash cards to help with his exam.");
    }

    @Override
    public void makeNotes(Scanner scanner) {
        logger.info(getFirstName() + " has decided to make notes for his upcoming exam.");
    }

    @Override
    public void officeHours(Scanner scanner) {
        logger.info(getFirstName() + " has decided to go to his professors office hours for extra help.");
    }

    @Override
    public void teacherAssistant(Scanner scanner) {
        logger.info(getFirstName() + " After class has decided to go to the Teacher Assistant to help you with the upcoming exam.");
    }
    @Override
    public void print() {
        logger.info("Student Name: " + getFirstName() + " " + getLastName());
        logger.info("Exam Score: " + getExamScore());
    }
}
