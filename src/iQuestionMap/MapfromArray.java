package iQuestionMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;
import java.util.TreeMap;

public class MapfromArray {

	public static void main(String[] args) {
	String[] cities= {"Moscow", "Berlin", "Paris", "Rome", "Washington D.C.", "Ankara"};
		
		Map<String, Integer> cityMap=new TreeMap<>();
		
		for(String city: cities) {
			cityMap.put(city, city.length());
		}
		
		System.out.println(cityMap);
		
		// 1. keySet   2. EntrySet   3. values
		
		Set<Entry<String, Integer>> cityEntries=cityMap.entrySet();
		
		Iterator<Entry<String, Integer>> entryIt=cityEntries.iterator();
		
		while(entryIt.hasNext()) {
			String city=entryIt.next().getKey();
			if(city.length()>7) {
				entryIt.remove();
			}
			

	}
	}}

