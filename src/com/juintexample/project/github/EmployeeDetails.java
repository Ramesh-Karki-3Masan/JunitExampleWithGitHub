package com.juintexample.project.github;


// regular java POJO class
public class EmployeeDetails {
	private String name;
	private double monthlySalary;
	private int age;
	
	// return the name
	public String getName(){
		return name;
	}
	// set the name
	public void setName(String name){
		this.name = name;
	}
	
	// return the monthlySalary
	public double getMonthlySalary(){
		return monthlySalary;
	}
	// set monthly salary
	public void setMonthlySalary(double monthlySalary){
		this.monthlySalary=monthlySalary;
	}
	// return age
	public int getAge(){
		return age;
	}
	// set age
	public void setAge(int age){
		this.age = age;
	}

}
