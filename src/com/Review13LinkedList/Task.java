package com.Review13LinkedList;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Task {

	public static void main(String[] args) {
		String str = "HashSet, class that implements Set interface. It does not allow "
				+ "duplicates and does not guarantee any insertion orders. It allows null elements.";
		
		str=str.replaceAll("[^A-Za-z]", "");

		char[] cArr = str.toLowerCase().toCharArray();
		
		TreeSet<Character> cSet=new TreeSet<>();
		
		for(char c:cArr) {
			cSet.add(c);
		}
		
		System.out.println(cSet);
		
		
		for(Character chr:cSet) {
			int count=0;
			for(int i=0; i<str.length(); i++) {
				if(chr==str.charAt(i)) {
					count++;
				}
			}
			
			System.out.println(chr+" is repeated "+ count + " times");
		}
		
		Map<Character , Integer> mapChar=new HashMap<>();
		for (Character chr : cSet) {
			int count=0;
			for (int i = 0; i < str.length(); i++) {
				if (chr == str.charAt(i)) {
					count++;
				}
				mapChar.put(chr, count);
			}
			
		}
		System.out.println(mapChar);

	}

	}


