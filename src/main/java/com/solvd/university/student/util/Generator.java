package com.solvd.university.student.util;

import com.solvd.university.student.*;
import com.solvd.university.student.humans.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;
import java.util.Scanner;

public class Generator {
    private static final Logger logger = LogManager.getLogger(Generator.class);

    public static Student generateStudent(String firstName, String lastName, int studentID, int examScore) {
        return new Student(firstName, lastName, studentID, examScore);

    }

    public static SecurityOfficer generateSecurityOfficer(String firstName, String lastName, int securityID) {
        return new SecurityOfficer(firstName, lastName, securityID);
    }

    public static Professor generateProfessor(String firstName, String lastName, int professorID) {
        return new Professor(firstName,lastName, Professor.TeachingStatus.NOT_TEACHING);
    }


    public static void main(String[] args) {

        // Generate students
        Student john = generateStudent("John", "Smith", 1, 70);
//        studentOptions(john);

        Student emily = generateStudent("Emily", "Johnson", 2, 80);

        Student chris = generateStudent("Chris", "Luther", 3, 85);

        Student jaymee = generateStudent("Jaymee", "Miller", 4, 92);

        // Generate security officers
        SecurityOfficer miles = generateSecurityOfficer("Timothy", "Miles", 1);
//        securityOfficerOptions(miles);

        SecurityOfficer ryan = generateSecurityOfficer("Ryan", "Simons", 2);
        SecurityOfficer nathanial = generateSecurityOfficer("Nathanial", "Turner", 3);
        SecurityOfficer kyle = generateSecurityOfficer("Kyle", "Chapman", 4);


        //      Instance of Gym
        Gym sacramentoGym = new Gym("Sacramento State university Gym");
        Gym sanFranciscoGym = new Gym("San Francisco state university Gym");
        Gym chicoStateGym = new Gym("Chico State University Gym");


//        instances for courses
        Course math = new Course("Math","Math Course", 1);
        Course english = new Course("English","English Course",2);
        Course computerScience = new Course("Computer Science","Computer Science Course",3);
        Course history = new Course("History","History Course",4);



//       instances for Universities
        University sacramentoState = new University("Library of Sacramento State University", "Sacramento State University",25000, sacramentoGym);
        University.addUniversityNameToSet(sacramentoState.getUniversityName());
        University.addUniversityToMap(sacramentoState);

        sacramentoState.addStudent(john);

        sacramentoState.addStudent(emily);
        sacramentoState.addSecurityOfficer(miles);
        sacramentoState.addSecurityOfficer(ryan);

//
        logger.info("all university max gym capacity : " + University.getMaxCapacity());
        logger.info("All university max student capacity : " + University.getMaxStudents());

//        List of all security officers in Sacramento state university
        for (SecurityOfficer securityOfficer : sacramentoState.getSecurityOfficerList()) {
            logger.info(securityOfficer.getFirstName() + " " + securityOfficer.getLastName() + " is a security in : " + sacramentoState.getUniversityName());
        }
//        List of all students attending Sacramento state university
        for (Student student : sacramentoState.getStudentList()) {
            logger.info(student.getFirstName() + " " + student.getLastName() + " is attending : " + sacramentoState.getUniversityName());
        }

        University sanFranciscoState = new University("Library of San Francisco State University","San Francisco State University", 30000, sanFranciscoGym);
        University.addUniversityNameToSet(sanFranciscoState.getUniversityName());
        University.addUniversityToMap(sanFranciscoState);
        sanFranciscoState.addStudent(chris);

        sanFranciscoState.addStudent(jaymee);
        sanFranciscoState.addSecurityOfficer(nathanial);
        sanFranciscoState.addSecurityOfficer(kyle);


        University chicoState = new University("Chico State Library","Chico State", 35000,chicoStateGym);
        University.addUniversityNameToSet(chicoState.getUniversityName());
        University.addUniversityToMap(chicoState);

//        For loop for all the key values for universities and their tuition
        for (Map.Entry<String, Double> entry : University.getUniversityMap().entrySet()) {
            String universityName = entry.getKey();
            double tuition = entry.getValue();
            logger.info("University Name: " + universityName + ", Tuition: " + tuition);
        }
//        For loop for all University in set collection
        logger.info("All universities in the set:");
        for (String universityName : University.getUniversityNamesSet()) {
            logger.info(universityName);
        }



//        List of all security officers in San Francisco state University
        for (SecurityOfficer securityOfficer : sanFranciscoState.getSecurityOfficerList()) {
            logger.info(securityOfficer.getFirstName() + " " + securityOfficer.getLastName() +  " is a security in :" + sanFranciscoState.getUniversityName());
        }
//        List of all students attending San Francisco state university
        for (Student student : sanFranciscoState.getStudentList()) {
            logger.info(student.getFirstName() + " " + student.getLastName() + " is attending : " + sanFranciscoState.getUniversityName());
        }

//        Department instances
        Department<String> mathDepartment = new Department<>("Math Department");
        Department<String> englishDepartment = new Department<>("English Department");
        Department<String> computerScienceDepartment = new Department<>("Computer Science Department");
        Department<String> historyDepartment = new Department<>("History Department");

        TA arnold = new TA("Arnold", "Allen",mathDepartment, TA.TutoringStatus.CURRENTLY_TUTORING);
        TA jenny = new TA("Jenny","Tran", englishDepartment, TA.TutoringStatus.NOT_TUTORING);
        TA lewis = new TA("Lewis", "Smith", computerScienceDepartment, TA.TutoringStatus.CURRENTLY_TUTORING);
        TA jessica = new TA("Jessica", "Barrios", historyDepartment, TA.TutoringStatus.NOT_TUTORING);

//        TA's in Sacramento state university
        sacramentoState.addTA(arnold);
        sacramentoState.addTA(jenny);

        for (TA ta : sacramentoState.getTaList()) {
            logger.info(ta.getFirstName()+ " " + ta.getLastName() + " is a TA in " + sacramentoState.getUniversityName()+ " in the : "+ ta.getDepartment().getDepartmentName());
        }

//        TA's in San Francisco state university
        sanFranciscoState.addTA(lewis);
        sanFranciscoState.addTA(jessica);

        for (TA ta : sanFranciscoState.getTaList()) {
            logger.info(ta.getFirstName()+ " " + ta.getLastName() + " is a TA in " + sanFranciscoState.getUniversityName()+ " in the : "+ ta.getDepartment().getDepartmentName());
        }



//        Enrollment instances
        Enrollment enrollJohn = new Enrollment("Chess club",john, math);
//        System.out.println(enrollJohn.getStudent().getFirstName());

        Enrollment enrollEmily = new Enrollment("Dance club",emily, english);

        Enrollment enrollChris = new Enrollment(null,chris,computerScience);

        Enrollment enrollJaymee = new Enrollment("Acting club", jaymee, history);

//        Professor instances
        Professor Matt = new Professor("Matt", "Hughes", Professor.TeachingStatus.TEACHING);
        Professor paige = new Professor("Paige","Garner", Professor.TeachingStatus.TEACHING);
        Professor jose = new Professor("Jose", "Marcos", Professor.TeachingStatus.NOT_TEACHING);
        Professor eliza = new Professor("Eliza","Lane", Professor.TeachingStatus.NOT_TEACHING);

//        List of all professors in Sacramento state university
        sacramentoState.addProfessor(Matt);
        sacramentoState.addProfessor(paige);

        for (Professor professor : sacramentoState.getProfessorList()) {
            logger.info(professor.getFirstName() + " " + professor.getLastName() + " is the professor in " + sacramentoState.getUniversityName());
        }

//        List of all professors in San Francisco state university
        sanFranciscoState.addProfessor(jose);
        sanFranciscoState.addProfessor(eliza);

        for (Professor professor : sanFranciscoState.getProfessorList()) {
            logger.info(professor.getFirstName() + " " + professor.getLastName() + " is the professor in " + sanFranciscoState.getUniversityName());
        }



//      Scholarship instances
        ScholarShip goodStudent = new ScholarShip("good academics", 5000);

        ScholarShip greatStudent = new ScholarShip("great academics", 10000);

        ScholarShip outstandingStudent = new ScholarShip("outstanding academics", 20000);



        // For loop for all students in Sacramento State that will receive scholarships
        for (Student student : sacramentoState.getStudentList()) {
            if (student.getExamScore() >= 91) {
                student.setScholarship(outstandingStudent);
                logger.info(student.getFirstName() + " " + student.getLastName() + " received the " + outstandingStudent.getScholarShipNameName() + " scholarship.");
            } else if (student.getExamScore() >= 80 && student.getExamScore() < 91) {
                student.setScholarship(greatStudent);
                logger.info(student.getFirstName() + " " + student.getLastName() + " received the " + greatStudent.getScholarShipNameName() + " scholarship.");
            } else if (student.getExamScore() >= 70 && student.getExamScore() < 80) {
                student.setScholarship(goodStudent);
                logger.info(student.getFirstName() + " " + student.getLastName() + " received the " + goodStudent.getScholarShipNameName() + " scholarship.");
            } else {
                logger.info(student.getFirstName() + " " + student.getLastName() + " did not receive a scholarship.");
            }
        }
        // For Loop for all students in San Francisco State
        for (Student student : sanFranciscoState.getStudentList()) {
            if (student.getExamScore() >= 91) {
                student.setScholarship(outstandingStudent);
                logger.info(student.getFirstName() + " " + student.getLastName() + " received the " + outstandingStudent.getScholarShipNameName() + " scholarship.");
            } else if (student.getExamScore() >= 80 && student.getExamScore() < 91) {
                student.setScholarship(greatStudent);
                logger.info(student.getFirstName() + " " + student.getLastName() + " received the " + greatStudent.getScholarShipNameName() + " scholarship.");
            } else if (student.getExamScore() >= 70 && student.getExamScore() < 80) {
                student.setScholarship(goodStudent);
                logger.info(student.getFirstName() + " " + student.getLastName() + " received the " + goodStudent.getScholarShipNameName() + " scholarship.");
            } else {
                logger.info(student.getFirstName() + " " + student.getLastName() + " did not receive a scholarship.");
            }
        }
    }


    public static void studentOptions(Student student, Scanner scanner) {
        // Implement the studentOptions method

        logger.info("Choose either if the student is studying, reading, or doing homework. ");

        // Read the user's input
        String userResponse = scanner.nextLine();

        // Check the user's response and call the appropriate method on the provided Student object
        if (userResponse.equalsIgnoreCase("studying")) {
            student.studying(scanner);

        } else if (userResponse.equalsIgnoreCase("reading")) {
            student.reading(scanner);
        } else if (userResponse.equalsIgnoreCase("homework")){
            student.homework(scanner);
        } else {
            logger.info("Invalid input. Please type 'study' or 'read'.");

        }
        // Close the scanner
//        scanner.close();
    }

    public static void studentOptionsTwo(Student student, Scanner scanner) {
        // Implement the studentOptions method

        logger.info("You must prepare for an upcoming Exam. Choose between review,'cards' to make flash cards or 'notes' to make notes of your past lectures and homework. ");

        // Read the user's input
        String userResponse = scanner.nextLine();

        // Check the user's response and call the appropriate method on the provided Student object
        if (userResponse.equalsIgnoreCase("review")) {
            student.review(scanner);

        } else if (userResponse.equalsIgnoreCase("cards")) {
            student.flashCards(scanner);
        } else if (userResponse.equalsIgnoreCase("notes")){
            student.makeNotes(scanner);
        } else {
            logger.info("Invalid input. Please type 'study' or 'read'.");

        }
        // Close the scanner
//        scanner.close();
    }

    public static void studentOptionsThree(Student student, Scanner scanner) {
        // Implement the studentOptions method

        logger.info("You are preparing well for the exam. Decide if you want to go to 'office' to meet your professor for more help or 'tutor' to meet the teacher assistant for more help. ");

        // Read the user's input
        String userResponse = scanner.nextLine();

        // Check the user's response and call the appropriate method on the provided Student object
        if (userResponse.equalsIgnoreCase("office")) {
            student.officeHours(scanner);

        } else if (userResponse.equalsIgnoreCase("tutor")) {
            student.teacherAssistant(scanner);
        } else {
            logger.info("Invalid input. Please type 'study' or 'read'.");

        }
        // Close the scanner
//        scanner.close();
    }

    public static void studentOptionsFour(Student student, Scanner scanner) {
        // Implement the studentOptions method

        logger.info("Choose on their free time what the student will do. nap, eat or socialize. ");

        // Read the user's input
        String userResponse = scanner.nextLine();

        // Check the user's response and call the appropriate method on the provided Student object
        if (userResponse.equalsIgnoreCase("nap")) {
            student.nap(scanner);

        } else if (userResponse.equalsIgnoreCase("eat")) {
            student.eat(scanner);
        } else if (userResponse.equalsIgnoreCase("socialize")){
            student.socialize(scanner);
        } else {
            logger.info("Invalid input. Please type 'sleep' or 'eat' or 'socialize'.");

        }
        // Close the scanner
//        scanner.close();
    }

}
