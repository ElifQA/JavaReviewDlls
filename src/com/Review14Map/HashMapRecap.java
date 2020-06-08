package com.Review14Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapRecap {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<>();
		
		System.out.println(map.isEmpty());
		map.put("name", "John");
		map.put("age", "40");
		map.put("lastname","Smith" );
		map.put("company", "syntax");
		System.out.println(map.isEmpty());
		System.out.println(map);
		
		Map<String, String> grade=new HashMap<>();
		grade.put("chemistry", "A");
		grade.put("music", "A");
		grade.put("art", "B");
		grade.put("electronic", null);
		//putAll(map)
		map.putAll(grade);
		
		System.out.println(map);
		map.remove("music");//remove()
		//.containsKey() boolean 
		boolean isName=map.containsKey("name");
		System.out.println(isName+ " is name available ");
		//.containsvalue()
		boolean isNm=map.containsValue("John");
		System.out.println("is name available "+isNm);
		
		//.size()---howmany elements
		//.clear()----delete all elements in the map --return void
		//.get()
		System.out.println(map.get("name"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
