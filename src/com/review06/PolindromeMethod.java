package com.review06;

public class PolindromeMethod {
	
		
	/* 	Create a method that will take a String and
	return whether String is palindrome or not.
	Method should be available to all classes
	within your projects. */
	
	public boolean isPalindrome(String word) {
		boolean isPolindrome=true;
		
		String reverse="";
		for (int i=word.length()-1; i>=0; i-- ) {
			reverse+=word.charAt(i);
		
		}if(reverse.equalsIgnoreCase(word)) {
			System.out.println(reverse +" is polindrome");
		}
		return isPolindrome;
	}
	public static void main(String[] args) {
		PolindromeMethod obj=new PolindromeMethod();
		boolean o=obj.isPalindrome("racecar");
		System.out.println(o);
	}
	}


