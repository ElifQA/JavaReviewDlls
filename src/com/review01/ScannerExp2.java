package com.review01;

import java.util.Scanner;

public class ScannerExp2 {
	/*
	 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average,D-Bad, 
	 * any other grade --> Not Acceptable. At theend your program should print 
	 * which grade was entered by a user with explanation.
	 */

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your grade");
		String grade=scan.nextLine();
		String abc;
		
		switch(grade) {
		case "A":
			abc="Excellent";
			break;
		case "B":
			abc="good";
			break;
		case "C":
			abc="average";
			break;
		case "D":
			abc="bad";
			break;
			default:
				abc="not acceptable";
			}
		System.out.println(grade+" "+abc);
		
		

	}

}
