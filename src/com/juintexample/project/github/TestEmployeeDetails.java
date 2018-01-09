package com.juintexample.project.github;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {
	EmployeeBusinessLogic empBus = new EmployeeBusinessLogic();
	EmployeeDetails empDet = new EmployeeDetails();
	
	// test to check Appraisal
	@Test
	public void testCalculateAppraisal(){
		empDet.setName("Ramesh");
		empDet.setAge(30);
		empDet.setMonthlySalary(8000);
		double appraisal = empBus.calculateAppraisal(empDet);
		assertEquals(500, appraisal, 0.0);
	}
	
	// test to check salary
	@Test
	public void testCalculateYearlySalary(){
		empDet.setAge(30);
		empDet.setMonthlySalary(8000);
		empDet.setName("Ramesh");
		
		double salary = empBus.calculateYearlySalary(empDet);
		assertEquals(9600, salary, 0.0);
	}

}
