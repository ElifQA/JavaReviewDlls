package com.Review12CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	/*
	 * Create an arrayList of words. Remove every
word that ends with “e”. Use iterator

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<>();
		list.add("imece");
		list.add("elma");
		list.add("karpuz");
		list.add("sandalye");
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String str=it.next();
			if(str.endsWith("e")) {
				it.remove();
			}
		}
		System.out.println(list);
	}

}
