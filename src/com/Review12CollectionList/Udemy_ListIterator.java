package com.Review12CollectionList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Udemy_ListIterator {

	public static void main(String[] args) {
		/*
		 * remove all null values from an ArrayList
		 */
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(14);
		list.add(null);
		list.add(23);
		list.add(56);
		list.add(5);
		list.add(null);
		
		ListIterator it=list.listIterator();
		while(it.hasNext()) {
			if(it.next()== null) {
				it.set(0); //its changed into 0
				//it.remove(); //it remove all null values
			}
		}
		System.out.println(list);
		
		
		//changed all odd number from linkedlist to even number
		LinkedList<Integer> link=new LinkedList<Integer>();
		link.add(78);
		link.add(83);
		link.add(5);
		link.add(14);
		link.add(7);
		
		
		System.out.println();
		ListIterator itr=link.listIterator();
		
		while (itr.hasNext()) {
			int i = (int) itr.next(); //casting 
			if(i % 2==1) {
				i++;
				itr.set(i);
				
				
			}
		}
		
		System.out.println(link);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
