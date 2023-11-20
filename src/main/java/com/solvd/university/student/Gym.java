package com.solvd.university.student;

import java.util.ArrayList;
import java.util.List;

public class Gym {
    private String gymName;


    public Gym(String gymName) {
        this.gymName = gymName;

    }

    public String getGymName() {
        return gymName;
    }

    public void setGymName(String gymName) {
        if (gymName == null || gymName.contains("!@#$%^&*()_+-")) {
            throw new GymInvalidException();
        }
        this.gymName = gymName;
    }

}
