package com.bridgelabz.UC10;

import java.util.Random;

public class CompanyEmpWage {
    public final String companyName;
    public int wagePerHour;
    public int workingDays;
    public int max_workingHours;


   // Generating Constructors
    public CompanyEmpWage(String companyName, int wagePerHour, int workingDays, int max_workingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.max_workingHours = max_workingHours;
    }

    public int ComputeEmpWage() {
        //variables
        int totalWage = 0;
        int dailyWage;
        int workingHour = 0;
        int totalWorkingHour = 0;
        int day = 0;
        //computation
        while (workingHour <= max_workingHours && day < workingDays) {

            Random random = new Random();
            int attendance = random.nextInt(3);
            switch (attendance) {
                case 0:
                    // ABSENT
                    workingHour = 0;
                    break;
                case 1:
                    //PRESENT
                    workingHour = 8;
                    break;
                default:
                    //HALF-DAY
                    workingHour = 4;
                    break;
            }

            day++;
            dailyWage = workingHour * wagePerHour;
            totalWage += dailyWage;
            totalWorkingHour += workingHour;
        }
        return totalWage;
    }
    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "companyName='" + companyName + '\'' +
                ", wagePerHour=" + wagePerHour +
                ", workingDays=" + workingDays +
                ", max_workingHours=" + max_workingHours +
                '}';
    }
}
