package com.review06;


public class SubClass{
		protected int intgernum=222;
		void print() {
			System.out.println(intgernum);
			
		}
	

//class main{
	public static void main(String[] args) {
		SubClass obj=new SubClass();
		obj.print();
	}
}
