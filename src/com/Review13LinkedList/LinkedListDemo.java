package com.Review13LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String > list =new LinkedList<>();
		list.add("black");
		list.add("yellow");
		list.add("red");
		list.add("green");
		System.out.println(list.get(0));
		//regular for loop
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		Iterator<String > it=list.iterator();
//		while (it.hasNext()) {
//			System.out.println(list);
//			it.next();
//			it.remove();
//		}
//		System.out.println(list);
//		it=list.iterator();
		
		for (int i=0; i<list.size(); i++) {
			//list.remove(); hepsini silmiyor bir atliyip siliyor
			list.clear();
		}
		System.out.println(list);
	
	for(int i=list.size()-1;i>0;i--) {
		list.remove();
	}
		}


}
