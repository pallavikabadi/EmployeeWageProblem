package com.bridgelabz;

import java.util.Random;

public class EmpWedge {
public static void main(String[] args) {

        System.out.println("*** Welcome To EMPLOYEE WAGE COMPUTATION PROGRAM ***");
        System.out.println();
 /*
   Create class method to compute Employee wage And calling the object of Employee wage Builder in the main method
 */
        EmpWageBuilder tcs = new EmpWageBuilder("TCS",30,24,121);
        System.out.println(tcs);
        tcs.ComputeEmpWage();
        EmpWageBuilder  infosys= new EmpWageBuilder("Infoss",20,22,130);
        System.out.println(infosys);
        infosys.ComputeEmpWage();
        EmpWageBuilder mindtree = new EmpWageBuilder("INFO Mindtree",50,22,160);
        System.out.println(mindtree);
        mindtree.ComputeEmpWage();
    }
    }
