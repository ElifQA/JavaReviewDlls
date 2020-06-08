package com.Review13LinkedList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetRecap {

	public static void main(String[] args) {

		// no index --> we cannot use methods with index
		// no duplicate value
		System.out.println("---------HashSet-----------");
		
		HashSet<Integer> numSet = new HashSet<>();

		numSet.add(23);
		numSet.add(-15);
		numSet.add(6);
		numSet.add(123);
		numSet.add(56);

		numSet.add(123);
		numSet.add(-15);

		System.out.println(numSet);
		
		System.out.println("-----------LinkedHashSet------------");

		LinkedHashSet<Integer> numSet1 = new LinkedHashSet<>();

		numSet1.add(23);
		numSet1.add(-15);
		numSet1.add(6);
		numSet1.add(123);
		numSet1.add(56);

		numSet1.add(123);
		numSet1.add(-15);

		System.out.println(numSet1);
		
		System.out.println("---------------TreeSet---------------");
		
		TreeSet<Integer> numSet2 = new TreeSet<>();

		numSet2.add(23);
		numSet2.add(-15);
		numSet2.add(6);
		numSet2.add(123);
		numSet2.add(56);
	}
}
