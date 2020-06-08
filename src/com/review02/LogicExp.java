package com.review02;

import java.util.Scanner;

public class LogicExp {
	/*Write a program will print it is a weekend or weekday. 
	 * 1-5 weekend 6-7weekday
	 */
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int day;
		System.out.println("enter number of a day");
		day=scan.nextInt();
		if (day>=1 && day <=5) {
			System.out.println("its a weekday");
		}else if(day==6 || day==7) {
			System.out.println("it is a weekend");
			
		}else {
			System.out.println("invalid day");
		}
	}

}
