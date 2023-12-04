package com.solvd.university.student;

import com.solvd.university.student.University;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class UniversityReflection {

    public static String inspectUniversityClass() {
        Class<?> universityClass = University.class;

        StringBuilder result = new StringBuilder();

        // Print information about fields
        result.append("Fields in University class:\n");
        Field[] fields = universityClass.getDeclaredFields();
        for (Field field : fields) {
            result.append("Field Name: ").append(field.getName()).append(", Type: ").append(field.getType()).append("\n");
        }

        // Print information about methods
        result.append("\nMethods in University class:\n");
        Method[] methods = universityClass.getDeclaredMethods();
        for (Method method : methods) {
            result.append("Method Name: ").append(method.getName()).append(", Return Type: ").append(method.getReturnType()).append("\n");
        }

        return result.toString();
    }
}