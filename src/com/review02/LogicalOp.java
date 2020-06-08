package com.review02;

public class LogicalOp {

	public static void main(String[] args) {
		boolean isSunny=true;
		int temp=75;
		
		if(isSunny) {
			if(temp>70) {
				System.out.println("it is a sunny day");
			}
		}
		if(isSunny && temp>70) {
			System.out.println("it is a sunny day.");
		}
		
		if(isSunny || temp>70 || temp!=30){
			System.out.println("it is a sunny day.");
		}
	}
	

}
