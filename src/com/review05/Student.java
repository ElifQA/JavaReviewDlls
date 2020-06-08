package com.review05;

public class Student {
	String name;
	String lastName;
	int age;
	char grade;
	String email;
	char gender;
	static String schoolName="Granberry elemantary";
	
	public static void study() {//methodlarda return type olmak zorunda
		System.out.println("Student studies courses");
	}
	
	void playGame() {
		System.out.println("Student play game after class");
	}
	
	void add(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="Mike";
		s1.lastName="Brown";
		s1.age=8;
		s1.gender='M';
		
		Student s2=new Student();
		s1.name="Maria";
		s1.lastName="Brown";
		s1.age=52;
		s1.gender='F';
		
		System.out.println(s1.name);
		System.out.println(schoolName);//static oldgu icin s1 koymaya gerekyok
		study(); //static method
		s1.playGame();
		s1.add(15, 10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
