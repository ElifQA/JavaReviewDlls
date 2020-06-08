package com.review06;

public class IQStudy {
	public static void main(String[] args) {
		IQStudy obj=new IQStudy();
		boolean s=obj.isPalindrome("anna");
		System.out.println(s);
	}
	
	/* 	Create a method that will take a String and
	return whether String is palindrome or not.
	Method should be available to all classes
	within your projects. */

public boolean isPalindrome(String word) {
	boolean isPalindrome=false;
	
	String temp="";  //  ---> elma ---> amle  // -->
	
	
	
	for(int i=word.length()-1; i>=0; i--) {
		
		temp+=word.toLowerCase().charAt(i);
	}
	
	System.out.println(temp);
	
	if(word.toLowerCase().equals(temp)) {
		isPalindrome=true;
	}
	
	return isPalindrome;		
}
}



