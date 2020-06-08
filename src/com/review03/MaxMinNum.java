package com.review03;

public class MaxMinNum {

	public static void main(String[] args) {
	int [] array= {34, 54,-21,98,-2};
	
	int max=array[0];
	int min=array[0];
	
	for (int i=0; i<array.length; i++) {
		if (max<array[i]) {
			max=array[i];
			}
		}
		System.out.println(max);	
		System.out.println();
		for (int i=0; i<array.length; i++) {
			if (array[i]<min) {
				min=array[i];
			}
		}
	System.out.println(min);
	System.out.println("adhance loop");	
	 for (int num:array) {
		 if(num<min) {
			 min=num;
		 }
	 }
	 System.out.println(min);
	 System.out.println();
	
	 int []arr= {9,7,90,2,-45};
	 int max1=arr[0];
	 int min1=arr[0];
	 for (int row:arr) {
		 if(row>max1) {
			 max1=row;
		 }
	 }
	 System.out.println("max number"+max1);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
