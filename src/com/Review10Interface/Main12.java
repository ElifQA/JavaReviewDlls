package com.Review10Interface;

public class Main12 implements MyInterface{

	@Override
	public void method() {
		System.out.println("implementation of method1");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("implementation of method2");
		
	}
	public static void main(String[] args) {
		MyInterface obj=new Main12();
		obj.method();
		obj.method2();
		
	}

}
