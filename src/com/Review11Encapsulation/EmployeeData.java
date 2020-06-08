package com.Review11Encapsulation;

public class EmployeeData {
	/*
	 * Encapsulation
	 * 1. the variables inside class should be private
	 * 2 provide getter setter method to modify and view the variables values
	 * Define public setter and getter methods to modify 
	 * and view the variables' values and access them outside
	 *  the class only through getters and setters.
	 *  getter have return type setter dont have return type

	 */

	private int ssn;
	private String empName;
	private  int empAge;
	
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

