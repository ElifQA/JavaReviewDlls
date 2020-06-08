package com.review08;

public class Task {
	/*
	 * 1) Create 1 class in which create a methods
that will calculate the area (volume) of
● Rectangle
● Square
● Box
Use separate class to test your code

	 */
	//method overloading e ornek
	//compile time polymorphism early binding static binding
	
	public static int calculateArea(int length, int height) {
		return length*height;
	}
	public static int  calculateArea(int length) {
	int area=length*length;
	return area;
	}
	public static int  calculateArea(int length, int height, int depth) {
		int area=(length*height +length*depth+height*depth)*2;
		return area;

}
	public static void main(String[] args) {
		int areaofRectangle=calculateArea(5,4);
		int areaofSquare=calculateArea(5);
		int areaofBox=calculateArea(5, 2,3);
		
		System.out.println(areaofRectangle);
		
		System.out.println(areaofSquare);
	}
}

