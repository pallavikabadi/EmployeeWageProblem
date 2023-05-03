package com.bridgelabz.UC11;

public class EmpWage {
    public static ComputeEmpWage objectArray[] = new ComputeEmpWage[3];
    public static void main(String[] args) {

        System.out.println("Welcome To EMPLOYEE WAGE COMPUTATION PROGRAM ***");
        System.out.println();

   //Create class method to compute Employee wage And calling the object of Employee wage Builder in the main method

        objectArray[0] = new ComputeEmpWage("TCS",30,24,121);
        int empWageTcs = objectArray[0].ComputeEmpWage();
        System.out.println(objectArray[0]);
        System.out.println("Employee of Tcs Monthly Wage is " + empWageTcs + " $ ");
        System.out.println();
        objectArray[1] = new ComputeEmpWage("Infosys",20,22,130);
        int empWageInfosys = objectArray[1].ComputeEmpWage();
        System.out.println(objectArray[1]);
        System.out.println("Employee of Infosys Monthly Wage is " + empWageInfosys + " $ ");
        System.out.println();
        objectArray[2] = new ComputeEmpWage("Mindtree",50,22,160);
        int empWageMindtree = objectArray[2].ComputeEmpWage();
        System.out.println(objectArray[2]);
        System.out.println("Employee of Middtree Wage is " + empWageMindtree+ " $ ");
    }

}
