package com.Review10Interface;

public interface Outputs {//repl178
	
		  
		//private int a=8; private almiyor
		
	void display(double result );
		}
		interface Functions extends Outputs{
		  void display(double result);
		  double adding(double firstNumber, double SecondNumber);
		  double subtracting(double firstNumber, double SecondNumber);
		  double multiply(double firstNumber, double SecondNumber);
		  double dividing(double firstNumber, double SecondNumber);
		}

class Main3 implements Functions{

	@Override
	public void display(double result) {
		System.out.println(result);
	}

	@Override
	public double adding(double firstNumber, double SecondNumber) {
	
		return firstNumber+SecondNumber;
	}

	@Override
	public double subtracting(double firstNumber, double SecondNumber) {
		// TODO Auto-generated method stub
		return firstNumber-SecondNumber;
	}

	@Override
	public double multiply(double firstNumber, double SecondNumber) {
		// TODO Auto-generated method stub
		return firstNumber*SecondNumber;
	}

	@Override
	public double dividing(double firstNumber, double SecondNumber) {
		// TODO Auto-generated method stub
		return firstNumber/SecondNumber;
	}

	
}
