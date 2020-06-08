package com.Review12CollectionList;

import java.util.ArrayList;

public class Task2 {
	/*
	 * /* Create an arrayList of drinks. 
	 * If any drink has letter “a” or “e” replace it with water. 

	 */

	public static void main(String[] args) {
		// iterator 1.hasNext() ---2 next()
		ArrayList<String>drink=new ArrayList<>();
		drink.add("cola");
		drink.add("juice");
		drink.add("tea");
		drink.add("milk");
		drink.add("wather");
		drink.add("kephir");
		System.out.println(drink);
		
		for (int i=0; i<drink.size(); i++) {
			String temp=drink.get(i);
			if (temp.contains("a") || temp.contains("e")){
				drink.set(i, "water");
			}
		}
		System.out.println(drink);
	}

}
