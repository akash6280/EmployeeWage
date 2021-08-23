package com.bridgelabz.employeewagecalculator;

public class EmployeeWageCalculation {
	public static void main(String[] args) {
		 int fullTime=1;
			int employeeWagePerHour=20;
			int employeeHour=0;
			int employeeWage=0;		
			double empCheck=Math.floor(Math.random()*10)%2;
			if(empCheck==fullTime)
				employeeHour=8;
			else
				employeeHour=0;
			employeeWage=employeeHour*employeeWagePerHour;
			System.out.println("Employee Wage :"+employeeWage);

	}

}
