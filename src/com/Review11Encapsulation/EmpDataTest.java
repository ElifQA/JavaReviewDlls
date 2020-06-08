package com.Review11Encapsulation;

public class EmpDataTest {

	public static void main(String[] args) {
		EmployeeData emp=new EmployeeData();
		emp.setEmpAge(35);
		emp.setEmpName("john");
		emp.setSsn(123456);
		System.out.println("Employee age :" +emp.getEmpAge());
		System.out.println("Employee name is : "+emp.getEmpName());
		System.out.println("Employee name is : "+emp.getSsn());

	}

}
