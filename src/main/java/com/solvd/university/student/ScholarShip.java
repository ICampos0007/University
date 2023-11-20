package com.solvd.university.student;

public class ScholarShip {
    private String scholarShipName;

    private double amount;

    public ScholarShip(String scholarShipName, double amount) {

        this.scholarShipName = scholarShipName;
        this.amount = amount;
    }

    public String getScholarShipNameName() {
        return scholarShipName;
    }

    public void setScholarShipNameName(String scholarShipName) {
        this.scholarShipName = scholarShipName;
    }

    public double getAmount() {
        return  amount;
    }

    public void  setAmount(double amount) {
        this.amount = amount;
    }



}
