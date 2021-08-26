package com.bridgelabz.employeewagecalculator;

public class EmployeeWageCalculation {
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	
	
	public static void computeEmployeeWage(String companyName,int employeeWagePerHour,int numberOfWorkDays,int maxHours)
	{
		int employeeHour=0;
		int totalEmployeeWage=0;
		int totalWorkingDays=0;
		int totalEmployeeHours=0;
		while(totalWorkingDays<numberOfWorkDays && totalEmployeeHours<=maxHours){
		    totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random()*10)%3;
		    switch(empCheck) {
		         case 1:
			            employeeHour=8;
			            break;
		         case 2:
			            employeeHour=4;
			            break;
		         default:
			            employeeHour=0;
		     }
		     totalEmployeeHours+=employeeHour;
		     System.out.println("Day# :"+totalWorkingDays+" Employee Hour "+ employeeHour);
		}
		totalEmployeeWage=totalEmployeeHours*employeeWagePerHour;
		System.out.println("Company name :"+companyName+" \nTotal Employee Wage :"+totalEmployeeWage);
	}
	
	public static void main(String[] args) {
		
		computeEmployeeWage("TCS",50,15,70);
		computeEmployeeWage("INFOSYS",51,20,60);
		computeEmployeeWage("WIPRO",53,17,80);
	}
}
