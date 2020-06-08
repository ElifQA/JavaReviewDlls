package com.review06;

public class MethodRepl {
	
	public static void m1() {
		int i=2;
		int t=7;
		
		System.out.println("m1 method implementation");
	}
	
	public void m2() {
		System.out.println("m2 method imp");
	}
	public void forLoop() {
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	void PrintTwice(String str, int times) {
		for (int i=0; i<times; i++) {
			System.out.println(str);
		}
		
	}
	public void time(int a, int b) {
		System.out.println(a+":"+b);
		
	}
	void mult(int a1, int a2) {
		int mul=a1*a2;
		System.out.println("Multiplication = "+mul);
	}
	public boolean beTrue() {
		return true;
		
	}
	public int aaaa() {
		int a=3+2;
		 
		return a;
	}
	public int practiceOne() {
		int a=2;
		return a;
		
	}
	
	public  String makeCapital(String str) {
		String s=str.toUpperCase();
		return s;
	}
	
	public int addTwo(int x, int y) {
		//int z= x+y;
		return x+y;
	}
	// in method body write the logic to return the given number in opposite value. 
	//(if given number is positive result will be negative or vice versa )
	double negate(double num) {
		double negate=num*1;
		return negate;
		
	}
	//write your logic on getChar method to Find the character in given String at given index number 

	char getChar(String word, int index) {
		
		      return    word.charAt(index);
		
		}
	//will return true if both num1 and num2 are even OR  Return false if one
	//or both given numbers are not even
	boolean bothEven(int num1, int num2) {
		if(num1%2==0 && num2%2==0) {
			return true;
		}else {
			return false;
		}
		
		
	}
	String makeThreeSubstr(String word, int startIndex, int endIndex) {
		String returnvalue="";
		for (int i=0; i<=2; i++) {
			
		returnvalue+=word.substring(startIndex, endIndex);
		}
		return returnvalue;
	}
	
	
	
	
	public static void main(String[] args) {
		MethodRepl obj=new MethodRepl();
		String sub=obj.makeThreeSubstr("hello", 0, 2);
		System.out.println(sub);
		
		boolean even=obj.bothEven(21, 12);
		System.out.println(even);
		
		char c=obj.getChar("hello", 1);
		System.out.println(c);
		
		double ng=obj.negate(-2);
		System.out.println(ng);
		
		int add=obj.addTwo(20, 5);
		System.out.println(add);
		
		String s1=obj.makeCapital("test");
		System.out.println(s1);
		
		int d=obj.practiceOne();
		System.out.println(d);
		
		int abc=obj.aaaa();
		System.out.println(abc);
		
		System.out.println(true);
		obj.mult(15, 2);
		obj.time(11, 30);
		obj.PrintTwice("Don't make me say this twice!", 2);
		obj.forLoop();
		m1();
		obj.m1();
		obj.m2();
		
		
		
		
		
	}

}
