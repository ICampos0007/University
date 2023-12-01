package com.solvd.university;

import com.solvd.university.student.interfaces.*;
import com.solvd.university.student.humans.Student;
import com.solvd.university.student.util.Generator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Logger logger = LogManager.getLogger(Main.class);

        logger.info("Hello World!");
        // Create an instance of Generator
        Generator generator = new Generator();


        Scanner scanner = new Scanner(System.in);

        // Generate a student
        Student john = Generator.generateStudent("John", "Smith", 1, 70);

        // Implement IPrint using a lambda expression
        IPrint studentPrinter = () -> {
            logger.info("Student Name: " + john.getFirstName() + " " + john.getLastName());
            logger.info("Exam Score: " + john.getExamScore());
        };

        // Call the print method
        studentPrinter.print();


        // Call studentOptions method from Generator
        Generator.studentOptions(john, scanner);
        Generator.studentOptionsTwo(john, scanner);
        Generator.studentOptionsThree(john, scanner);


        // Close the Scanner once all methods have been called
        scanner.close();
    }
}