package com.solvd.university;
import com.solvd.university.student.humans.SecurityOfficer;
import com.solvd.university.student.humans.Student;
import com.solvd.university.student.util.Generator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

import static com.solvd.university.student.util.Generator.generateSecurityOfficer;


public class Main {
    public static void main(String[] args) {

        System.setProperty("log4j.configurationFile","log4j2.xml");

        Logger logger = (Logger) LogManager.getLogger(Main.class);

        logger.info("Hello World!");
        // Create an instance of Generator
        Generator generator = new Generator();


        Scanner scanner = new Scanner(System.in);

        // Generate a student
        Student john = Generator.generateStudent("John", "Smith", 1, 70);

        // Call studentOptions method from Generator
        Generator.studentOptions(john, scanner);
        Generator.studentOptionsTwo(john, scanner);
        Generator.studentOptionsThree(john, scanner);

        SecurityOfficer miles = generateSecurityOfficer("Timothy", "Miles", 1);

//        Generator.securityOfficerOptions(miles);

        // Close the Scanner once all methods have been called
        scanner.close();


    }

}