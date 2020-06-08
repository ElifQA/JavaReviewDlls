package com.review03;

import java.util.Arrays;

public class ArrayRecap {

	public static void main(String[] args) {
	int []Array=new int [3];
	Array[0]=3;
	Array[1]=90;
	
	//indexoutofboundexception verir
	//dogrudan hepsine yazdiramiyoruz
	System.out.println(Arrays.toString(Array));//bununla yaziliyor
	
	
	int [] iArray;
	iArray=new int [4];
	
	//dataType[] arrName=new datatype[arraysize];
	int []arr= {12,48,78,754};
	System.out.println(arr[0]);
	
	System.out.println(arr.length);
	for (int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	for( int array:arr) {
		System.out.print(array+"-");
	}
	
	
	
	

	}

}
