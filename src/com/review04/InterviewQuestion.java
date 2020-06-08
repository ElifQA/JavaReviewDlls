package com.review04;

import java.util.Arrays;

public class InterviewQuestion {

	public static void main(String[] args) {
//		1.Write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a temporary variable?
//		2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
//		3.Find out how many alpha characters present in a string?


//		6.Write a Java Program to find whether a String is palindrome or not? if reversed string and original string are same --> 
//        string is palindrome
//		7.Write a java program to check whether a given number is prime or not? Prime: is a number that has to meet 2 conditions
        //: it should be be divisible by 1 and by itself ONLY 2, 3, 5, 7, 11, 13, 17, 19, 23
//				8.Write a Java Program to print first 10 numbers of Fibonacci series
        
        //1
        int a=10;
        int b=5;
        
        a=a+b;//10+5=a15
        b=a-b;//15-5=b10
        a=a-b;//15-10=a5
        
        System.out.println("a is"+a);
        System.out.println("b is "+b);
        
       //max min number and second largest
       
        int []array= {98,7,43,-4,23,6789};
        
        Arrays.sort(array);
        System.out.println(array[0]);
        System.out.println(array[array.length-1]);
        System.out.println(array[array.length-2]);
        
        //second way
        int max= array[0];
        int min= array[0];
        int second=array[0];
         for (int i=0; i<array.length; i++) {
        	 if (array[i]>max) {
        		second=max;
        		 max=array[i];
        	 }else if(array[i]<min) {
        		 min=array[i];
        		 
        	 }}
        	 System.out.println("max number "+max);
    		 System.out.println("second "+second);
    		 System.out.println("min number"+min);
        
        String str="a54s89&6%im092&^";
       
        String replaced=str.replaceAll("[^A-Za-z]", "");
        System.out.println(replaced);
        System.out.println(replaced.length());

        //		4.How to find out the part of the string from a String? What is substring?  
       String st="Today is Monday. I hate first day of week";
       String st1=st.substring(0, 5);
       System.out.println(st1);
       System.out.println(st.length());
      
       System.out.println("Find number of words in string?");
       
       String [] arstr=st.split(" ");
       int arlength=arstr.length;
       System.out.println(arlength);
       System.out.println("reverse---------------");

       //		5.Write a java program to reverse String? 
       String str2="Hello world this is Elif";
       
       StringBuffer s=new StringBuffer(str2);
       System.out.println(s.reverse());
    
       //Reverse a string word by word? 
       String word="Today is Monday. I am studying";
       String [] w=word.split(" ");
       for (int  i=w.length-1; i>=0; i--) {
    	   System.out.print(w[i]+" ");
       }
       
       
       char[]chrArr;
		chrArr=str2.toCharArray();
		System.out.println(chrArr);
		for (char c:chrArr) {
			System.out.print(c+"");
		}
		System.out.println();
		//polindrome
		String pol="kayak";
		String rev="";
		for (int i=pol.length()-1; i>=0; i--) {
		rev+=pol.charAt(i);
		}
       if(pol.equals(rev)) {
    	   System.out.println("polindrome");
       }else {
    	   System.out.println("not pol");
       }
       
		
       
       
       
       
       
       
       
       
       
       

	}

}
