package com.bridgelabz.UC9;

public class EmpWedge {

    /*private static final int wagePerHour = 20;
    private static final int workingDays = 20;
    private static final int max_workingHours = 100;
*/
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
    /*//UC7:
    public void EmployeeWage() {

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

    public static void main(String[] args) {
        System.out.println("*** Welcome To Employee Wage Computation Program ***");

        EmpWedge empWedge=new EmpWedge();
        empWedge.EmployeeWage();
    }*/
    //UC8:---------
  /*      public void ComputeEmployeeWage(String companyName, int wagePerHour, int workingDays, int max_workingHours){

            System.out.println("Name of the Company : " +companyName);
            System.out.println("Company Wage per Hour : " +wagePerHour+ " $");
            System.out.println("Company Working Days : " +workingDays+ " Days");
            System.out.println("Company Maximum Working Hours : " +max_workingHours+ " Hrs");

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
            System.out.println("Employee of " +companyName+ " Monthly Wage is " + totalWage+ " $ ");
            System.out.println("______");
    }

    public static void main(String[] args) {
        System.out.println("*** Welcome To Employee Wage Computation Program ***");

        EmpWedge empWedge=new EmpWedge();
        empWedge.ComputeEmployeeWage("Tcs", 30, 24, 121);
        empWedge.ComputeEmployeeWage("Infosys", 20, 22, 130);
        empWedge.ComputeEmployeeWage("Mindtree", 50, 21, 160);
    }*/

    //UC9:------------

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
