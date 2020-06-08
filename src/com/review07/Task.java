package com.review07;

public class Task {
	String name;
	int grade1, grade2, grade3;

	public Task(String name, int grade1, int grade2, int grade3) {
		this.name=name;
		this.grade1=grade1;
		this.grade2=grade2;
		this.grade3=grade3;
		
	}
	public void calculateAverage() {
		int average=(grade1+grade2+grade3)/3;
		System.out.println("Average of "+name+ "is "+average);
	}
}
