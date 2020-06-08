package com.Review15Exceptions;

public class ExceptionIntro {

	public static void main(String[] args) {
	
		
		try {
			int i=9/0;
		}
		catch (ArithmeticException ae){
			ae.getMessage();
			//ae.printStackTrace();
			System.out.println("I am a catch block, division by zero is not allowed");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		//throw exception
		int age=4;
		if(age<5) {
			try {
				throw new ArithmeticException("age to play more");
			}catch (Exception e) {
				System.out.println("this is home made exception");
			}finally {
				System.out.println("this block is executed either-way");
			}
		}else {
			System.out.println("welcome to school");
		}
	}

}
