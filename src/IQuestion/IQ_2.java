package IQuestion;

import java.util.Arrays;

public class IQ_2 {

	public static void main(String[] args) {
		
		
		//Write a java program to find the second largest number in the array? Maximum
		// * and minimum number in the array?
		
		int [] array= { 5,34,21,8,98765,-1};
		
		Arrays.sort(array);
		System.out.println(array[array.length-1]);
		System.out.println(array[array.length-2]);
		
		//second way
		int max=array[0];
		int min=array[0];
		int second=array[0];
		
		for (int i=0; i<array.length; i++) {
			if(array[i]>max) {
				second=max;
				max=array[i];
			}
			 if(array[i]<min) {
				min=array[i];
				
				
			}}
			System.out.println(max);
			System.out.println(min);
			System.out.println(second);
		
		
		
	}
}
