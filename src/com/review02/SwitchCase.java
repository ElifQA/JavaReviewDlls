package com.review02;

import java.util.Scanner;

public class SwitchCase {
//relational operators > <>= <=, ==
	//logical operators && || !
	//switch case u can use only ==
	//byte short int kullanabiliyoruz 
	//long float double boolean u can not use
	
	public static void main(String[] args) {
		int day=5;
		String days;
		switch (day) {
		case 1:
			days="monday";
			break;
		case 2:
			days="tuesday";
			break;
			default :
				System.out.println("invalid");
			
		}
		
		Scanner scan =new Scanner(System.in);
		String grade;
		String level;
		System.out.println("enter grade");
		grade=scan.next().toUpperCase();
		
		switch (grade) {
		case "A":
			level="Excellent";
			break;
		case "B":
			level="good";
			break;
			
		}

	}

}
