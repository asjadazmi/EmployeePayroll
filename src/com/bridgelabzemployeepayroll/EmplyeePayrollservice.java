package com.bridgelabzemployeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmplyeePayrollservice {
	 public static List<EmployeePayrollData> employeePayrollData;

	    public EmplyeePayrollservice(List<EmployeePayrollData> employeePayrollData) {
	        this.employeePayrollData = employeePayrollData;
	    }

	    public static void main(String[] args)  {
	        employeePayrollData = new ArrayList<>();
	        EmplyeePayrollservice employeePayrollService = new EmplyeePayrollservice(employeePayrollData);
	        Scanner consoleinputreader = new Scanner(System.in);
	        employeePayrollService.read(consoleinputreader);
	        employeePayrollService.write();


	    }

	    public static void read(Scanner consoleinputreader) {
	        System.out.println("Enter the id:");
	        int id = consoleinputreader.nextInt();
	        System.out.println("Enter the name");
	        String name = consoleinputreader.next();
	        System.out.println("enter the salary:");
	        double salary = consoleinputreader.nextDouble();
	        employeePayrollData.add(new EmployeePayrollData(id,name,salary));

	    }

	    public static void write() {
	        System.out.println("writing" + employeePayrollData);
	    }
	

}
