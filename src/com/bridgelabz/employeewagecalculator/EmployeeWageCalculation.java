package com.bridgelabz.employeewagecalculator;

public class EmployeeWageCalculation {
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int EMPLOYEE_WAGE_PER_HOUR=20;
	public static final int NUMBER_OF_WORKING_DAYS=20;
	public static final int MAXIMUM_HOURS_IN_MONTH=100;
	public static void computeEmployeeWage()
	{
		int employeeHour=0;
		int totalEmployeeWage=0;
		int totalWorkingDays=0;
		int totalEmployeeHours=0;
		while(totalWorkingDays<NUMBER_OF_WORKING_DAYS && totalEmployeeHours<=MAXIMUM_HOURS_IN_MONTH){
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
		totalEmployeeWage=totalEmployeeHours*EMPLOYEE_WAGE_PER_HOUR;
		System.out.println("Total Employee Wage :"+totalEmployeeWage);
	}
	
	public static void main(String[] args) {
		
		computeEmployeeWage();
	}
}
