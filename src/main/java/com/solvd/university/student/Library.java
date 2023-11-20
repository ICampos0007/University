package com.solvd.university.student;

public abstract class Library {

    private String libraryName;
    private static final int MAX_CAPACITY = 500;

    private University university;

    public Library(String libraryName) {

        this.libraryName = libraryName;
    }



    public String getLibraryName() {
        return libraryName;
    }


    public void setLibraryName(String libraryName) {
        if (libraryName == null || libraryName.contains("!@#$%^&*()_+-")) {
            throw new LibraryInvalidException();
        }
        this.libraryName = libraryName;
    }

    public static int getMaxCapacity() {
        return MAX_CAPACITY;
    }

    public abstract String toString();
}
