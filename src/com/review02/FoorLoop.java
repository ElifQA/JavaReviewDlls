package com.review02;

public class FoorLoop {

	public static void main(String[] args) {
		for (int i=0; i<0; i++) {
			System.out.println(i+" ");
		}
		System.out.println();
		
		//second way
		int j=1;
		for (; j<=30; j+=5) {
			System.out.println(j+" ");
			
		}
		System.out.println();
		for(int k=3; k<=20;) {//increment enson uygaliniyor
			System.out.print(k+" ");
			k+=3;
		}
		System.out.println();
		for (int i=50; i>0; i-=7) {
			System.out.print(i+" ");
		}
		System.out.println("************************");
		for (int i=0; i<30; i++) {
			if(i==15) {
				break;
			}
			System.out.println(i+ " ");
		}
		System.out.println("--------------------");
		for (int k=0; k<50; k++) {
			if(k%4==0) {
				continue;
			}
			System.out.print(k+"-");
		}
		System.out.println();
		
		/*Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead 
		 * of the number and for the multiples of five print “Buzz”. For numbers which are multiples 
		 * of both three and five print “FizzBuzz”.
		*/
		 System.out.println();
		int i2=100;
		for (int i1=0; i1<=i2; i1++) {
			
			if (i1%15==0) {
				
			System.out.print("FizzBuzz"+" ");
		}else if(i1%5==0) {
			System.out.print("Buzz"+" ");
			
		}else if(i1%3==0) {
			System.out.print("Fizz"+" ");
		}else {
			System.out.print(i1+" ");
		}

	}

}}
