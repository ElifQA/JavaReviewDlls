package com.Review12CollectionList;

import java.util.ArrayList;

public class ReplPractice {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		Boolean b=list.isEmpty();
		System.out.println(b);
		
		list.add("Elif");
		System.out.println(list.isEmpty());
		System.out.println();
		//191
		ArrayList<Boolean> Alist=new ArrayList<>();
		Alist.add(true);
		Alist.add(false);
		Alist.add(false);
		
		ArrayList<Boolean> Blist=new ArrayList<>();
		Blist.add(true);
		Blist.add(false);
		Blist.add(false);
		for (Boolean l:Alist) {
			Blist.add(l);
			
		}
		System.out.println(Blist);

	}

}
