package com.bridgelabz.UC11;

public interface EmployeeWage {
    int ComputeEmpWage();
    public void addCompanyEmpWage(String companyName, int wagePerHour, int workingDays, int max_workingHours);
    public int getTotalWage(String company);

}
