package com.example.java;

import java.text.NumberFormat;

public class Employee {
    //create variables to hold the attributes of each instance
    private String name;
    private PositionTitle position;
    private boolean salary;
    private double payRate;
    private int shift;
    private String startDate;

    //create a Employee constructor method
    public Employee(String name, PositionTitle position, boolean salary, double payRate, int shift, String startDate) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.payRate = payRate;
        this.shift = shift;
        this.startDate = startDate;
    }

    //create the "getters and setters" to retrieve and modify the attributes of each instance as needed
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //use enum class for position attribute
    public PositionTitle getPosition() {
        return position;
    }

    //use enum class for position attribute
    public void setPosition(PositionTitle position) {
        this.position = position;
    }

    public boolean isSalary() {
        return salary;
    }

    public void setSalary(boolean salary) {
        this.salary = salary;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    //create a display method to display the attributes of an instance (nicely formatted) to the user
    public void display() {
        System.out.println(getName());
        System.out.println(getPosition() + " is salary: " + isSalary() + ", shift: " + shift + ".");
        System.out.println("Rate of pay is: $" + payRate + " per hour.");
    }

    //create a calculate method that will accept a number of hours and caluculate the weekly pay based on the
    //attributes of the employees job
    public void calculate(double hoursIn) {
        //create variables to hold values whilst making the calculations
        double pay;
        double overtime;
        String payCheque;

        //use NumberFormat to display values to the user to 2 decimal places
        NumberFormat nf = NumberFormat.getNumberInstance(); //we get the instance of the number
        nf.setGroupingUsed(true) ; // group by threes
        nf.setMaximumFractionDigits(2) ; //set the max number of decimal digits.
        nf.setMinimumFractionDigits(2) ; //set the min number of decimal digits.

        //use a conditional to calculate based on the shift the person works
        if (getShift() == 1) {
            //if salaried calculate pay based on set hours
            if (isSalary()) {
                pay = (payRate * 40);
                payCheque = nf.format(pay);
                //display the weekly pay
                System.out.println(name + " earned $" + payCheque + " this week.\n");
            }
            //if not salaried calculate pay based on the potential for overtime
            else {
                //if they did not work overtime
                if (hoursIn <= 40){
                    pay = payRate * hoursIn;
                    payCheque = nf.format(pay);
                    //display the weekly pay
                    System.out.println(name + " earned $" + payCheque + " this week.\n");
                }
                //else they did work overtime
                else {
                    overtime = hoursIn - 40;
                    pay = (40 * payRate) + (overtime * payRate * 1.5);
                    payCheque = nf.format(pay);
                    //display the weekly pay
                    System.out.println(name + " earned $" + payCheque + " this week.\n");
                }
            }
        }
        //condition to give workers from shift 2 a 5% pay incentive
        else if (getShift() == 2){
            //if salaried calculate pay based on set hours
            if (isSalary()) {
                pay = 1.05 * (payRate * 40);
                payCheque = nf.format(pay);
                //display the weekly pay
                System.out.println(name + " earned $" + payCheque + " this week.\n");
            }
            //if not salaried calculate pay based on the potential for overtime
            else {
                //if they did not work overtime
                if (hoursIn <= 40){
                    pay = 1.05 * (payRate * 40);
                    payCheque = nf.format(pay);
                    //display the weekly pay
                    System.out.println(name + " earned $" + payCheque + " this week.\n");
                }
                //else they did work overtime
                else {
                    overtime = hoursIn - 40;
                    pay = 1.05 * ((40 * payRate) + (overtime * payRate * 1.5));
                    payCheque = nf.format(pay);
                    //display the weekly pay
                    System.out.println(name + " earned $" + payCheque + " this week.\n");
                }
            }
        }
        //condition to give workers from shift 3 a 10% pay incentive
        else {
            //if salaried calculate pay based on set hours
            if (isSalary()) {
                pay = 1.1 * (payRate * 40);
                payCheque = nf.format(pay);
                //display the weekly pay
                System.out.println(name + " earned $" + payCheque + " this week.\n");
            }
            //if not salaried calculate pay based on the potential for overtime
            else {
                //if they did not work overtime
                if (hoursIn <= 40) {
                    pay = 1.1 * (payRate * 40);
                    payCheque = nf.format(pay);
                    //display the weekly pay
                    System.out.println(name + " earned $" + payCheque + " this week.\n");
                }
                //else they did work overtime
                else {
                    overtime = hoursIn - 40;
                    pay = 1.1 * ((40 * payRate) + (overtime * payRate * 1.5));
                    payCheque = nf.format(pay);
                    //display the weekly pay
                    System.out.println(name + " earned $" + payCheque + " this week.\n");
                }
            }
        }
    }
}
