package com.review08;

public class ConstRecap {
	//class name ile const name ayni olack
	//parameter vya non paramter 
	//no return type while method type is must
	//consc cannot be inherited to the child class
	ConstRecap(){
		System.out.println("I am non argument constructor in Parent class");
	}
	
	ConstRecap(int num){
		this(); //this key word const cagiriyor ilk satirda olacak
		System.out.println("I am one argument constructor int Parent class");
		
		
	}
	ConstRecap(int num , String name){
		this(num);
		System.out.println(" I am two arguments in parent calss");
	}
	
//	public static void main(String[] args) {
//		//ConstRecap obj =new ConstRecap(10 );//one argument olan
//		ConstRecap obj1 =new ConstRecap(10, "John");
//		
//	}
}
