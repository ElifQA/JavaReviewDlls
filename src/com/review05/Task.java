package com.review05;

public class Task {
	/* Create a method that will take 2 parameters as a 
	 * numbers and prints which number is larger. 
	 * */
public static void findLarger(int a , int b) {
	if (a>b) {
		System.out.println(a+" is larger then"+ b);
	}else if(b>a){
		System.out.println(b+" is larger than "+a);
	}else {
		System.out.println(a+" is equal to"+b);
	}
}
	 public static void main(String[] args) {
		//Task obj=new Task(); //static degilken 
		//obj.findLarger(10, 20);
		findLarger(6, 5);//static 
		findLarger(2,3);
	}

}

