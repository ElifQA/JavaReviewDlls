package com.Review12CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<>();
		list.add(14);
		list.add(14);
		list.add(23);
		list.add(56);
		list.add(5);
		//regular loop
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+"-");
		}
		System.out.println();
		//for each loop advanced for loop
		for(Integer i:list) {
			System.out.print(i+"/");
		}
		System.out.println();
		//Iterator= for single use and only ascending direction
		//hasNext() next()
 		
		Iterator <Integer> it =list.iterator();		
 		while(it.hasNext()) {
 			System.out.print(it.next()+"==");
 		}
 		System.out.println();
 	
 		it=list.iterator();
 		while(it.hasNext()) {
 			it.next();
 			it.remove();
 		
 		}
 		System.out.println(list);
 		
 		}
		
	}


