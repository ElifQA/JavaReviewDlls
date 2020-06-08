package iQuestionMap;

import java.util.*;
import java.util.Map.Entry;


public class  PersonTest{
	public static void main(String[] args) {
		
		TreeMap<String, Person> empMap=new TreeMap<>();
		empMap.put("AB1001", new Person("John", "Smith", 35, 55000));
		empMap.put("AB1000", new Person("James", "Brown", 40, 515000));
		empMap.put("AB1003", new Person("Jenn", "Smith", 35, 89000));
		empMap.put("AB1004", new Person("ali", "Sena", 56, 5890));
		
		Set<String > set=empMap.keySet(); // get()
		for(String key:set) {
			System.out.println("emp id "+key);
			empMap.get(key).printDetails();
		}
		System.out.println("iterator----------------keyset");
		
		Iterator<String> it=set.iterator();
		
		while(it.hasNext()) {
			String itkey=it.next();
			System.out.println(itkey);
			empMap.get(itkey).printDetails();
		}
		System.out.println("collection---------------------values");
		//values
		Collection<Person> value=empMap.values();
		
		for (Person val:value) {
			val.printDetails();
		}
		System.out.println("iterator----------------values");
		Iterator<Person> itr=value.iterator();
		while(itr.hasNext()) {
			itr.next().printDetails();
		}
		System.out.println("entryset--------------");
		
		Set<Entry<String,Person >> entryset=empMap.entrySet();
		for(Entry<String,Person> entry:entryset) {
			System.out.println(entry.getKey());
			entry.getValue().printDetails();
		}
		System.out.println("-----iterator-------");
		Set<Entry<String,Person>> entry=empMap.entrySet();
		
		Iterator<Entry<String,Person>> ent=entry.iterator();
		while(ent.hasNext()) {
			Entry<String, Person> entkey=ent.next();
			System.out.println(entkey.getKey());
			entkey.getValue().printDetails();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
