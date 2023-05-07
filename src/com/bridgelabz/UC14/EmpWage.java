
package com.bridgelabz.UC14;

import java.util.ArrayList;
import java.util.HashMap;

public class EmpWage implements EmployeeWage{
    public static ArrayList<CompanyEmpWage> companyEmpWages = new ArrayList<CompanyEmpWage>();
    public static HashMap<String, CompanyEmpWage> companyEmpWageHashMap = new HashMap<>();

    @Override
    public int ComputeEmpWage() {
        for (int i=0; i<companyEmpWages.size(); i++) {
            CompanyEmpWage companyEmpWage= companyEmpWages.get(i);
            companyEmpWage.setTotalEmpWage(companyEmpWage.ComputeEmpWage());
        }
        return 0;
    }

    @Override
    public void addCompanyEmpWage(String companyName, int wagePerHour, int workingDays, int max_workingHours) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHour, workingDays, max_workingHours);
        companyEmpWages.add(companyEmpWage);
        companyEmpWageHashMap.put(companyName,companyEmpWage);
    }

    @Override
    public int getTotalWage(String company) {
        return companyEmpWageHashMap.get(company).totalEmpWage;
    }

    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation Problem");
        System.out.println();

        //Create class method to compute Employee wage And calling the object of Employee wage Builder in the main method

        EmpWage emp=new EmpWage();
        emp.addCompanyEmpWage("TCS",30,24,121);
        emp.addCompanyEmpWage("Infosys",20,22,130);
        emp.addCompanyEmpWage("Mindtree",50,22,160);
        emp.ComputeEmpWage();
        System.out.println("Employee of TCS Total Monthly Wage = "+emp.getTotalWage("TCS")+" $");
    }
}
