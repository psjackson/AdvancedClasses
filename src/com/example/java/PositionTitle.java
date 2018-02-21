package com.example.java;

public enum PositionTitle {
    //set up possible values as a simple list
    ADMINISTRATION("Administrator"), PRODUCTION("Production"), SALES("Sales"), MAINTENANCE("Maintenance"), TECHNICAL("Technical"), SECRETARIAL("Secretarial");

    //set a string variable called name
    private String name;

    //create a constructor method for the enum class
    PositionTitle(String name) {
        this.name = name;
    }

    //override method so the variable displays as a string
    @Override
    public String toString() {
        return name;
    }

}
