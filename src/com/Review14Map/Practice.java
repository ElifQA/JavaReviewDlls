package com.Review14Map;

import java.util.*;
import java.util.Map.Entry;


public class Practice {

	public static void main(String[] args) {
		LinkedList<String > list =new LinkedList<>();
		list.add("black");
		list.add("yellow");
		list.add("red");
		list.add("green");
		list.add("red");
		System.out.println(list);
		
		Set<String> set=new HashSet<>();
		set.addAll(list);
		System.out.println(set);
		
//		list.clear();
//		System.out.println(list);
//		
//		list.addAll(set);
//		System.out.println(list);
//		list.remove("black");
		list.get(2);
		System.out.println(list);
		System.out.println("_________Map----------");
		Map<String, String> stuMap=new LinkedHashMap<>();
		stuMap.put("name", "John");
		stuMap.put("phone", "4056-8996");
		stuMap.put("lastname","Smith" );
		stuMap.put("school", "syntax");
		
		System.out.println(stuMap);
		Set<Entry<String, String>> entryset=stuMap.entrySet();
		
		for (Entry<String,String>s:entryset) {
			String key=s.getKey();
			String value=s.getValue();
			System.out.println(key+" : "+value);
		}
		System.out.println("_________iterator-----------");
		Iterator<Entry<String, String>> it=entryset.iterator();
		while(it.hasNext()) {
			Entry<String,String> ent= it.next();
			String entry=ent.getKey()+ent.getValue();
			System.out.println(entry);
			
		}
		System.out.println("-----------------------------------");
		Map<Integer, String> best=new LinkedHashMap<>();
		best.put(5698, "printer");
		best.put(5696, "TV");
		best.put(5697, "LG");
		best.put(5686, "printer");
		best.get(5698);
		
		Collection<String> values=best.values();
		for (String val:values) {
			System.out.println(val);
			
		}
		System.out.println("iterator===============");
		Iterator<String> t=values.iterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		
		Set<Entry<Integer, String>> sList=best.entrySet();
		for (Entry<Integer, String> ent:sList) {
			String en=ent.getKey()+" :"+ent.getValue().toUpperCase();
			System.out.println(en);
			
		}
		Set<Integer> keys=best.keySet();
		for(Integer k:keys) {
			System.out.println(k+ " "+best.get(k));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
