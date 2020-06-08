package IQuestion;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class IQ_1 {

	public static void main(String[] args) {
		
		// Write a program to swap 2 numbers without a temporary variable? 
//		int a=5;
//		int b=10;
//		
//		a=a+b;//5+10=15
//		b=a-b;//15-10=5
//		a=a-b;
//		System.out.println("a "+a+" b ="+b);
		
		
		
		String s1="black";
		String s2="yellow";
		
		s1=s1+s2;
		s2=s1.replaceAll(s2, "");
		s1=s1.replaceAll(s2, "");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Question 8
		//to print first 10 numbers of fibonacci series
		// 0-1-1-2-3-5-8-13-21
		int a=0;
		int b=1;
		int sum=0;
		for (int i=0; i<10; i++) {
			System.out.println(sum);
			
			sum=a+b;
			b=a;
					a=sum;
		}
		
		
		//9 remove duplicate from arraylist
		ArrayList<Integer> arr= new ArrayList<>();
		arr.add(5);
		arr.add(6);
		arr.add(5);
		arr.add(8);
		
		Set<Integer> set= new TreeSet<>();//Treeset<>(arr) 2,way
		set.addAll(arr);
		System.out.println(set);
		
		Set<Integer> s=new LinkedHashSet<>();
		for (Integer st:s) {
			s.add(st);
		}
		System.out.println(s);
		
		Map<Integer, String >numMap=new LinkedHashMap<>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
