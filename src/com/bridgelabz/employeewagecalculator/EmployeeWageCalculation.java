package com.bridgelabz.employeewagecalculator;

public class EmployeeWageCalculation {
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	private String companyName;
	private int employeeWagePerHour;
	private int numberOfWorkDays;
	private int maxHours;
	
	
 EmployeeWageCalculation(String companyName, int employeeWAgePerHour, int numberOfWorkDays, int maxHours) {
		this.companyName = companyName;
		this.employeeWagePerHour = employeeWAgePerHour;
		this.maxHours = maxHours;
		this.numberOfWorkDays = numberOfWorkDays;
	}
	public  void computeEmployeeWage()
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
		EmployeeWageCalculation tcs = new EmployeeWageCalculation("TCS", 20,2,10);
		EmployeeWageCalculation infosys = new EmployeeWageCalculation("INFOSYS", 10,4,20);
		EmployeeWageCalculation wipro = new EmployeeWageCalculation("WIPRO", 20,2,10);
		tcs.computeEmployeeWage();
		infosys.computeEmployeeWage();
		wipro.computeEmployeeWage();
	}
}
