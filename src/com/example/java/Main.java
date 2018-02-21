package com.example.java;

public class Main {

    public static void main(String[] args) {
        //create 3 instances with designated values
        Employee emp1 = new Employee("Jane Doe", PositionTitle.ADMINISTRATION, true, 27.00, 1, "1/3/1992");
        Employee emp3 = new Employee("John Smith", PositionTitle.MAINTENANCE, false, 21.00, 3, "7/8/2005");
        Employee emp2 = new Employee("Larry Jackson", PositionTitle.PRODUCTION, false, 22.00, 2, "12/20/2014");

        //call the instanced method to display attributes and perform pay calculation
        emp1.display();
        emp1.calculate(45);
        emp2.display();
        emp2.calculate(50);
        emp3.display();
        emp3.calculate(35);
    }
}
