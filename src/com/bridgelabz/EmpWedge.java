package com.bridgelabz;

import java.util.Random;

public class EmpWedge {
    public static void main(String[] args) {
        System.out.println("*** Welcome To Employee Wage Computation Program ***");

        //UC1
        Random random = new Random();
        int present = random.nextInt(2);
        if (present == 1) {
            System.out.println("Employee is Present");
        }
        else
            System.out.println("Employee is Absent");

        //UC2
        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage;

        dailyWage = present * wagePerHour * fullDayHour;
        if (present == 1)
            System.out.println("Employee Wage Per Day = "+dailyWage);
        else
            System.out.println("Employee Wage Per Day = "+dailyWage);

    }

}
