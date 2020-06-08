package com.review07;

public class Child extends Parent{
	
	int grade1, grade2;
	public Child(String name, String lastname, int grade1, int grade2){
		super(name, lastname);
		this.grade1=grade1;
		this.grade2=grade2;
	}
	
	public void average() {
		int average=(grade1+grade2)/2;
		System.out.println(sname+slastname+" "+average);
	}

}
