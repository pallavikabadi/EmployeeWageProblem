package com.bridgelabz.UC11;

public class EmpWage {
    public static ArrayList<CompanyEmpWage> companyEmpWages = new ArrayList<CompanyEmpWage>();
    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation Problem");
        System.out.println();

   //Create class method to compute Employee wage And calling the object of Employee wage Builder in the main method

        companyEmpWages.add(new CompanyEmpWage("TCS",30,24,121));
        int empWageTcs = companyEmpWages.get(0).ComputeEmpWage();
        System.out.println(companyEmpWages.get(0));
        System.out.println("Employee of Tcs Monthly Wage is " + empWageTcs + " $ ");
        System.out.println();
        companyEmpWages.add(new CompanyEmpWage("Infosys",20,22,130));
        int empWageInfosys = companyEmpWages.get(1).ComputeEmpWage();
        System.out.println(companyEmpWages.get(1));
        System.out.println("Employee of Infosys Monthly Wage is " + empWageInfosys + " $ ");
        System.out.println();
        companyEmpWages.add(new CompanyEmpWage("Mindtree",50,22,160));
        int empWageMindtree = companyEmpWages.get(2).ComputeEmpWage();
        System.out.println(companyEmpWages.get(2));
        System.out.println("Employee of Middtree Wage is " + empWageMindtree+ " $ ");
    }

}
