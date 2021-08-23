package com.bridgelabz.employeewagecalculator;

public class EmployeeWageCalculation {
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int EMPLOYEE_WAGE_PER_HOUR=20;
	public static final int NUMBER_OF_WORKING_DAYS=20;
	public static void main(String args[]) {

		int employeeHour=0;
		int employeeWage=0;	
		int totalEmployeeWage=0;
		for(int day=0;day<NUMBER_OF_WORKING_DAYS;day++) {
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
		employeeWage=employeeHour*EMPLOYEE_WAGE_PER_HOUR;
		totalEmployeeWage+=employeeWage;
		System.out.println("Employee Wage :"+employeeWage);
		}
		System.out.println("Total Employee Wage :"+totalEmployeeWage);

	}
}
