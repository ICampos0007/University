package com.solvd.university.student;

import java.time.LocalDateTime;

public enum TutoringStatus {
    CURRENTLY_TUTORING,
    NOT_TUTORING;

    private LocalDateTime lastUpdated;

    // Constructor to set the initial timestamp
    TutoringStatus() {
        this.lastUpdated = LocalDateTime.now();
    }

    // Method to get the last updated timestamp
    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    // Method to update the tutoring status and timestamp
    public void updateStatus() {
        this.lastUpdated = LocalDateTime.now();
    }
}