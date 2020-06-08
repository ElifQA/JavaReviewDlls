package com.review03;

import java.util.Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		int [][]intArray=new int [2][3];
		intArray[0][0]=5;
		intArray[0][1]=25;
		intArray[0][2]=5;
		
		intArray[1][0]=5;
		intArray[1][1]=25;
		intArray[1][2]=51;
		System.out.println(Arrays.deepToString(intArray));
		
		int [][]arr= {
				{3,4,2,65,},
				{78,5,9,45,6},
				{9,23,90,}
		};
		System.out.println(arr[0].length);//birinci row
		System.out.println(arr[1].length);
		
		System.out.println();
		//dataType [][] arrayname=new datatype[rowSize][columnSize]
		//row sayisi belitmek zorundayiz column da degiliz
		
		for(int i=0;i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		/* 	Create a 2D array or integer type where
		you will store odd and even numbers in 3
		rows and 4 columns. Develop a program
		which will identify/print the even
		numbers only. */

//		
		int [][] oddeven= {{34,1,5,6}, {89,0,22,3},{4,12,97,1}};
		for (int []row:oddeven) {
			for(int col:row) {
				if (col%2==0) {
					
				System.out.print(col+" ");
				}
		}
			
		
		}
		System.out.println("_________");
		
		for (int i=0; i<oddeven.length;i++) {
			for(int j=0; j<oddeven[i].length; j++) {
				if(oddeven[i][j]%2==0 ) {
				
				System.out.print(oddeven[i][j]+" ");
				
				}}
		
		
		}
		
	}

}
