package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {
    public final String companyName;
    public int wagePerHour;
    public int workingDays;
    public int max_workingHours;
    /*
    Generating Constructors
     */
    public EmpWageBuilder(String companyName, int wagePerHour, int workingDays, int max_workingHours) {
        this.companyName =companyName;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.max_workingHours = max_workingHours;
    }
    public void ComputeEmpWage(){
        //   variables
        int totalWage = 0;
        int dailyWage;
        int workingHour = 0;
        int totalWorkingHour = 0;
        int day = 1;
        //computation
        while (workingHour <= max_workingHours && day <= workingDays) {
            /*
             * Attendance to check the employee is full tym work or part tym or Absent
             * We use the switch case For Attendance
             */
            Random random = new Random();
            int attendance = random.nextInt(3);
            System.out.println();
            System.out.println("DAY => "+day+ ";");
            switch (attendance) {
                case 0:
                    System.out.println("Employee is ABSENT");
                    workingHour = 0;
                    break;
                case 1:
                    System.out.println("Employee is PRESENT");
                    workingHour = 8;
                    break;
                default:
                    System.out.println("Employee is HALF-DAY");
                    workingHour = 4;
                    break;
            }

            day++;
            dailyWage = workingHour * wagePerHour;
            totalWage += dailyWage ;
            totalWorkingHour += workingHour;
            System.out.println("Employee Working Hour Per Day = "+workingHour);
            System.out.println("Employee Daily Wage = " + dailyWage);
        }
        System.out.println();
        System.out.println("Employee of Monthly Wage is " + totalWage+ " $ ");
        System.out.println("-----------");
    }
    @Override
    public String toString() {
        return "EmpWageBuilder{" +
                "companyName='" + companyName + '\'' +
                ", wagePerHour=" + wagePerHour +
                ", workingDays=" + workingDays +
                ", max_workingHours=" + max_workingHours +
                '}';
    }
}
