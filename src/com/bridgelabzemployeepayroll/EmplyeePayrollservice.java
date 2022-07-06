package com.bridgelabzemployeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.lang.*;

public class EmplyeePayrollservice  {
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
            try {
            	Gson gson=new Gson();
            	File file=new File("Employee.json");
            	FileWriter f=new FileWriter(file);
            	String jsonstring=gson.toJson(employeePayrollData);
            	System.out.println(jsonstring);
            	f.write(jsonstring);
            	f.close();
            }catch(Exception e) {
            	e.printStackTrace();
            }
	       


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
