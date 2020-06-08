package com.review01;

import java.util.Scanner;
/*
 * Write a program to store a boolean value of
whether user has diploma or not. If user has a
diploma, you should say congratulations,
otherwise program should suggest to get a
degree. Then if user has a degree program should
check a gpa score. If gpa score is higher or equals
to 3.5 → output should say “You are eligible for
scholarship”, otherwise → “You should have
studied harder” .
 */

public class ScannerExp {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner (System.in);
		System.out.println("Do you have diploma");
		Boolean diploma=scan.nextBoolean();
		
		System.out.println("enter your degree");
		double gpa=scan.nextDouble();
		
		if (diploma) {
			System.out.println("congratulations");
			System.out.println((gpa>=3.5) ? "You are eligible for scholarship" : "You should have studied harder ! ");
			
			
		}else {
			System.out.println("get a degree");
//		}
//		if(gpa>=3.5) {
//			System.out.println("you are eligible for scholarship");
//		}else {
//			System.out.println("study hard");
		}

	//System.out.println(message);
		
		

	}

}
