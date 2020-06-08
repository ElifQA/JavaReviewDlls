package com.Review09Abstract;

public class BasicCalculator extends Math{

	@Override
	public int sum(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public double divide(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}
	public static void main(String[] args) {
		Math obj=new BasicCalculator();
		System.out.println(obj.sum(15, 26));
		System.out.println(obj.divide(15, 4));
		System.out.println(obj.multiply(2.5, 3.2));
	}

}
