package com.Review12CollectionList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
	ArrayList<String> list =new ArrayList<>();//one way implement arrlist
	//List<String > arr=new ArrayList<String >();//second way parent of arraylist declared obj with parent
	
	ArrayList list2=new ArrayList<>();
	list2.add("John");
	list2.add("Smith");
	list2.add("alex");
	
	list.add("black");
	list.add("yellow");
	list.add("red");
	list.add("green");
		/*
		 * list.addAll(list2); System.out.println(list);
		 * 
		 * System.out.println(list2);
		 * 
		 * list.removeAll(list2); System.out.println(list);
		 */
	System.out.println(list.set(3, "Hasan"));
	
	System.out.println(list.get(0));
	list.add(1,"Donald");
//	list.removeAll(list); ---parentez icinde ki collection i siler
	System.out.println(list);
	System.out.println(list.set(4, "red"));
	//list.clear();//delete
	//remove() delete specific value using by index   by value
	list.remove(2);
	System.out.println(list.lastIndexOf("yellow"));
	System.out.println(list);
	
	/*for (String x:list) {
		System.out.println(x);
	}
	*/
	int count=0;
	for (Integer i=0; i<list.size(); i++) {
		if(list.get(i).contentEquals("red")){
			count++;
			
			
			
		}
	//	System.out.println(list.get(i));
		
	}
	System.out.println(count);
	
	
	
	
	}
}
