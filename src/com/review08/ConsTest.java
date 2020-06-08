package com.review08;

public class ConsTest  extends ConstRecap{
	String name;
	ConsTest (int num, String lastName){
		super(num, lastName);
		System.out.println("I am two argument constructor in child class");
	}
	public static void main(String[] args) {
		ConsTest obj =new ConsTest(12, "child");
	}

}
