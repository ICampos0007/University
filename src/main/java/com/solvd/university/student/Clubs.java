package com.solvd.university.student;

public abstract class Clubs {
    private String clubName;

    public Clubs(String clubName) {
        this.clubName = clubName;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public  abstract String toString();
}