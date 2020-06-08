package com.review02;

import java.util.Scanner;

public class WhileRecap {

	public static void main(String[] args) {
		int i=3;
		while(i>1) {
			System.out.println(i);
			i--;
		}
		int num=1;
		boolean b=true;
		while(b) {
			System.out.println(b);
			if (num==10) {
				b=false;
				
			}
			num++;
		}
//write program taht closes when user enters quit
		//if entered value is not equal "quit" 
		
		//breakten sonra code yazamiyoruz 
		//continue 
		String str;
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter a character");
			
			str=scan.nextLine().toLowerCase();
			if(str.contentEquals("quit")) {
				System.out.println("closing");
				break;
			}
			System.out.println(str);
		}
		
		//print all numbers 1-20 except multiples of 3
		int a=1;
		while (i<=20) {
			i++;
			if(i%3==0) {
				continue;
			}
			System.out.println(i+" ");
			
		}
		
		
		
	}

}










