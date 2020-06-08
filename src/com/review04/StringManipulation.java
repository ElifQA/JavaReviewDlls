package com.review04;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str="Today is Monday!!";
		String temp;
		//substring(int beginindex)----substring(int beginindex, int endindex)
		temp=str.substring(6);
		System.out.println(temp);

		temp=str.substring(6, 10);
		System.out.println(temp);

		//.replace(char oldChar, char newchar)
		
		temp=str.replace('d', 'T');
		System.out.println(temp);
		
		//replaceAll(String regex (regular expression) String replacment)
		temp=str.replaceAll("Today", "yesterday");
		System.out.println(temp);
		temp=str.toLowerCase().replaceAll("Today", "Yesterday");
		System.out.println(temp);
		
		//[A-Z] ---[a-z] [0-9] ^A-Z]
		String str1="Hel!lokij&89f^)ko";
		temp=str1.replaceAll("[^A-Za-z]", "");
		System.out.println(temp);
		temp=str1.replaceAll("[A-Za-z0-9]", "");
		System.out.println(temp);
		//replacefirst
		temp=str.replaceFirst("o", "A");
		System.out.println(temp);
		
		String str2="Java is an important programming language.";
		temp=str2.replaceFirst("Java", "Python");
		System.out.println(temp);
		
		//toCharArray()
		char[]chrArr;
		chrArr=str.toCharArray();
		System.out.println(chrArr);
		for (char c:chrArr) {
			System.out.print(c+"-");
		}
		System.out.println();
		String [] strArr= {"Sunday", "Monday", "Tuesday"};
		//System.out.println(strArr);
		System.out.println(Arrays.toString(strArr));
		System.out.println("split _________________");
		//split(String regex)
		String []strTemp;
		strTemp=str.split("is");
		for(String s:strTemp) {
			System.out.println(s+" ");
		}
		System.out.println();
		
		System.out.println("split-----------");
		String ex="Thank you for staying home. "
				+ "Enjoy free video games from Stadia Pro";
		

		String[] exArr;
		exArr=ex.split(" ");
		int exArrLength=exArr.length;
		
		System.out.println(exArrLength);
		//
		System.out.println();
		String example="Write a java program to reverse String?"
				+ " Reverse a string word by word?";
		
//		for(int i=s.length-1; i>=0; i--) {
//			
//		
//		System.out.print(s[i]+" ");
//		}
		System.out.println();
		String str6="Hello world! How are you? ";
		String[] ch2=str6.split(" ");

		for(int k=ch2.length-1; k>=0; k--) {
			System.out.print(ch2[k]+" ");
		}
		
		 
	        System.out.println("--------------------");
	        //charAt 
	        char[]exam= {'a','k','l'};
	        System.out.println(exam);
	      
	        
	        String trm="   How are you   ";
	       System.out.println(trm.trim());
		System.out.println(trm.replace(" ", ""));
		
		//.equals(String ---boolean
		String str4="Hello";
		
		boolean isEqual=str4.equals("hello");
		System.out.println(isEqual);
		//equalsIgnorecase
		isEqual=str4.equalsIgnoreCase("hello");
		System.out.println(isEqual);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
