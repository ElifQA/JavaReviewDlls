package com.review06;

public class ReturnTypeDemo {
	public static final String SCHOOL_NAME="Bilkent university";
	
	public static void sum(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public static final int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	
	
	public static void main(String[] args) {
		ReturnTypeDemo obj=new ReturnTypeDemo(); //static olmayan obj create et
		int num2=obj.add(34, 65);
		
		sum(15,5);
		int num1=34;
		//int num2=sum(75, 44);
		int num3=add(34, 65);//static olursa
		
		
	}

}
