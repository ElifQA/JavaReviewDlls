package com.Review14Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KeySetRecap {

	public static void main(String[] args) {
		Map<String, String> stuMap=new LinkedHashMap<>();
		stuMap.put("name", "John");
		stuMap.put("phone", "4056-8996");
		stuMap.put("lastname","Smith" );
		stuMap.put("school", "syntax");
		
		Set<String>keySet=stuMap.keySet();//keySet()
		System.out.println(keySet);
		//keyset enhanced loop
		for (String key:keySet){
			System.out.println(key+"--"+stuMap.get(key));
			
		}
		System.out.println("iterator============");
		//keyset+iterator
		Iterator<String > keyIt=keySet.iterator();
		while(keyIt.hasNext()) {
			String key=keyIt.next();
			String value=stuMap.get(key);
			System.out.println(key+"=="+value);
		}
		System.out.println("=========Values=========");
		
		Collection<String > values=stuMap.values();//values
		System.out.println(values);
		//values enhanced loop
		for (String value:values) {
			System.out.print(value+"***");
		}
		System.out.println();
		//values+iterator
		Iterator<String> valIt=values.iterator();
		while(valIt.hasNext()) {
			System.out.print(valIt.next()+"--");
		}
		System.out.println();//entrySet()
		System.out.println("==========entrySet=======");
		Set<Entry<String, String>> entrySet=stuMap.entrySet();
		//entryset +enhanced loop
		for(Entry<String, String> entry:entrySet) {
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"-------"+value);
			
		}
		System.out.println("==========iterator=======");
		Iterator<Entry<String, String >> entIt=entrySet.iterator();
		while(entIt.hasNext()) {
			Entry<String,String> ent=entIt.next();
			String key=ent.getKey();
			String value=ent.getValue();
			System.out.println(key+"---"+value);
		}
		System.out.println(stuMap);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
