package com.juintexample.project.github;

public class EmployeeBusinessLogic {
	// calculate the yearly salary of employee
	public double calculateYearlySalary(EmployeeDetails empDetails){
		double yearlySalary = 0;
		yearlySalary = empDetails.getMonthlySalary()*12;
		return yearlySalary;
	}
	
	// calculate the appraisal amount of employee
	public double calculateAppraisal(EmployeeDetails empDetails){
		double appraisal = 0;
		if(empDetails.getMonthlySalary()<10000){
			appraisal = 500;
		}else{
			appraisal = 1000;
		}
		return appraisal;
	}

}
