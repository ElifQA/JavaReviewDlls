package com.Review13LinkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {

	public static void main(String[] args) {
		String str="As Pennsylvania small businesses shuttered by coronavirus "
				+ "stay-at-home orders take their fight against Democratic Gov."
				+ " Tom Wolf to the Supreme Court, Judge Andrew Napolitano said "
				+ "Tuesday that he's not sure the justices will hear the case."
				+ "Appearing on America's Newsroom with host Ed Henry, Napolitano "
				+"said that the Pennsylvania state Supreme Court has ruled 4-3 in favor "
				+ "of the governor already, so the Supreme Court would likely not get involved.";
		
		str.toLowerCase().replaceAll("[^A-Za-z]", "");
		
		String [] temp=str.split(" ");
		Set<String > wordSet=new TreeSet<>();
		for (int i=0; i<temp.length; i++) {
			wordSet.add(temp[i]);
		}
		System.out.println(wordSet);
		for (String word:wordSet) {
			int count=0;
			for(int i=0; i<temp.length; i++ ) {
				if (word.equals(temp[i])) {
					count++;
				}
			}
			System.out.println(word+"is repeated "+count +" times");
		}
		
		
		
		//remove duplicate
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(12);
		arr.add(2);
		arr.add(89);
		arr.add(2);
		System.out.println(arr);
		
		//first way
		//HashSet<Integer> set=new HashSet<>(arr);
		//System.out.println(set);
		//second way
		HashSet<Integer> set=new HashSet<>();
		for(Integer i:arr) {
			set.add(i);
		}
		System.out.println(set);
		
		

		


	}

}
