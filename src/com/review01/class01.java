package com.review01;

public class class01 {

	public static void main(String[] args) {
	
		byte b=5;
		int i=b;
		
		int a=6;
		byte b1=(byte)a;
		System.out.println(b1);
		
		boolean diploma = true;
		double gpa = 3.1;
		if (diploma) {
			System.out.println("cong");
			if (gpa >= 3.5) {
				System.out.println("you are eligible scholarshp");
			} else {
				System.out.println("study hard");
			}

		} else {
			System.out.println("get a degree");
		}

	}

}
