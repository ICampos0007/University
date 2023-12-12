package com.solvd.university.student;

import java.time.DayOfWeek;
import java.time.LocalDate;

public enum SchoolWeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;

    // Method to get the next day in the school week based on the current date
    public SchoolWeekDay getNextDay() {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek nextDayOfWeek = currentDate.getDayOfWeek().plus(1); // Get the next day of the week
        return valueOf(nextDayOfWeek.toString());
    }
}