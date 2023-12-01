package com.solvd.university.student;

import com.solvd.university.student.humans.Professor;
import com.solvd.university.student.humans.SecurityOfficer;
import com.solvd.university.student.humans.Student;
import com.solvd.university.student.humans.TA;

import java.util.*;

public class University extends Library {
    private String universityName;
    private double tuition;
    private final List<Student> studentList;

    private final List<SecurityOfficer> securityOfficerList;

    private final List<Professor> professorList;
    private Gym gym;

    private final List<TA> taList;

    static final int MAX_STUDENTS = 50000;

    static final int MAX_GYM_CAPACITY = 500;

    private static final Calendar calendar = Calendar.getInstance();
    static final String ACADEMIC_YEAR = calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.YEAR) + 1);

    static final int MAX_LIBRARY_CAPACITY = 1000;

    static final int MAX_TAS = 250;
    private static final Map<String, Double> universityMap = new HashMap<>();

    private static final Set<String> universityNamesSet = new HashSet<>();

    // New enum for school week days
    public enum SchoolWeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }

    private SchoolWeekDay currentSchoolWeekDay;  // Current day of the school week




    public University(String libraryName, String universityName, double tuition, Gym gym) {
        super(libraryName);
        this.universityName = universityName;
        this.tuition = tuition;
        this.studentList = new ArrayList<>();
        this.securityOfficerList = new ArrayList<>();
        this.professorList = new ArrayList<>();
        this.gym = gym;
        this.taList = new ArrayList<>();
        this.currentSchoolWeekDay = SchoolWeekDay.MONDAY;
    }

    public void addStudent(Student student) {

        studentList.add(student);

    }

    public void addSecurityOfficer(SecurityOfficer securityOfficer) {
        securityOfficerList.add(securityOfficer);
    }

    public void addProfessor(Professor professor) {
        professorList.add(professor);
    }

    public void addTA(TA ta) {
        taList.add(ta);
    }



    public List<Student> getStudentList() {
        return studentList;
    }

    public List<SecurityOfficer> getSecurityOfficerList() {
        return securityOfficerList;
    }

    public List<Professor> getProfessorList() {
        return professorList;
    }

    public List<TA> getTaList(){
        return taList;
    }



    public String getUniversityName() {
        if (universityName == null) {
            throw new NullPointerException();
        }
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public static int getMaxStudents() {
        return MAX_STUDENTS;
    }

    public static int getMaxCapacity() {
        return MAX_GYM_CAPACITY;
    }

    public static String getAcademicYear() {
        return ACADEMIC_YEAR;
    }

    public static int getMaxLibraryCapacity() {
        return MAX_LIBRARY_CAPACITY;
    }

    public static int getMaxTas() {
        return MAX_TAS;
    }

    public static Map<String, Double> getUniversityMap() {
        return universityMap;
    }
    public static void addUniversityToMap(University university) {
        universityMap.put(university.getUniversityName(), university.getTuition());
    }

    public static void addUniversityNameToSet(String universityName) {
        universityNamesSet.add(universityName);
    }

    public static Set<String> getUniversityNamesSet() {
        return universityNamesSet;
    }

    public SchoolWeekDay getCurrentSchoolWeekDay() {
        return currentSchoolWeekDay;
    }

    public void setCurrentSchoolWeekDay(SchoolWeekDay day) {
        this.currentSchoolWeekDay = day;
    }


    @Override
    public String toString() {
        return "The: " + getLibraryName() + " is in :" + getUniversityName();
    }
}
