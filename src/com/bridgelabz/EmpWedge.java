package com.bridgelabz;

import java.util.Random;

public class EmpWedge {
    
    private static final int wagePerHour = 20;
    private static final int workingDays = 20;
    private static final int max_workingHours = 100;

    public static void main(String[] args) {
        System.out.println("*** Welcome To Employee Wage Computation Program ***");

        /*//UC1
        Random random = new Random();
        int present = random.nextInt(2);
        if (present == 0) {
            System.out.println("Employee is Present");
        }
        else if (present == 1)
            System.out.println("Employee is Absent");

        else
        System.out.println("Employee is PART-TIME");

        //UC2
        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage;
        int partTimeHour = 4;

        dailyWage = present * wagePerHour * fullDayHour;
        int partTimeWage = wagePerHour * partTimeHour;

        if (present == 0)
            System.out.println("Employee Wage Per Day = "+dailyWage);
        else if(present == 1)
            System.out.println("Employee Wage Per Day = "+dailyWage);
        else
        System.out.println("Employee Part Time Wage  = "+partTimeWage);

    */

        /*int wagePerHour = 20;
        int dailyWage;
        int workingHour;
        Random random = new Random();
        int present = random.nextInt(3);
        switch (present) {
            case 0:
                System.out.println("Employee is Present");
                workingHour = 8;
                break;

            case 1:
                System.out.println("Employee is Absent");
                workingHour = 0;
                break;

            default:
                System.out.println("Employee is Part Time");
                workingHour = 4;
                break;
        }
        dailyWage = workingHour * wagePerHour;
        System.out.println("Employee Daily Wage = " +dailyWage);
    }*/



            int totalWage = 0;
            int dailyWage;
            int workingHour = 0;
            int totalWorkingHour = 0;
            int day = 1;

            while (day <= workingDays && workingHour <= max_workingHours) {
                Random random = new Random();
                int present = random.nextInt(3);
                System.out.println();
                System.out.println("DAY => " + day + ";");
                switch (present) {
                    case 0:
                        System.out.println("Employee is ABSENT");
                        workingHour = 0;
                        break;
                    case 1:
                        System.out.println("Employee is PRESENT");
                        workingHour = 8;
                        break;
                    default:
                        System.out.println("Employee is PART-TIME");
                        workingHour = 4;
                        break;
                }
                day++;
                dailyWage = workingHour * wagePerHour;
                totalWage += dailyWage;
                totalWorkingHour += workingHour;
                System.out.println("Employee Working Hour Per Day = " + workingHour);
                System.out.println("Employee Daily Wage = " + dailyWage);
            }
            System.out.println("Employee Monthly Wage = " + totalWage + " $ ");

        }
}
