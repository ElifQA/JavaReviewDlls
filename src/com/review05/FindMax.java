package com.review05;

public class FindMax {
	// write a method which gets an array of integer and return the largest one
	public  int findMax(int[] intArr) {
							//type   //name istedigimiizi gireblrz	
		int max = intArr[0];
		for (int num : intArr) {
			if (num > max) {
				max = num;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		
		int[] sample = { 12, -90, 8, 123 };
		FindMax obj=new FindMax();
		
		int max=obj.findMax(sample);
		
		System.out.println(max);
	}
}
