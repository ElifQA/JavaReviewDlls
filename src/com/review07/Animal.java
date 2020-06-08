package com.review07;

public class Animal {
	String animalType;
	int age;
	Animal(String animalBreed){
		animalType=animalBreed;
	}
	
	Animal(String animal, int animalage){
		animalType=animal;
		age=animalage;
	}
	
	
	public void bark() {
		System.out.println("dogs bark");
	}
	Animal(){
		
	}
	public static void main(String[] args) {
		Animal dog=new Animal("husky", 5);
		
		Animal dog1= new Animal();
		
		dog1.animalType="kangal";
		dog1.age=3;
		Animal cat= new Animal("coban");
		

	}}
	

