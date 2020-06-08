package com.review08;

public class Overloading {
	
	public void sum(int num1, int num2) {
		System.out.println(num1+" "+num2+" ="+(num1+num2));
	}

	public void sum(int num1, int num2, int num3) {
		System.out.println(num1+"+ "+num2+num3+" ="+(num1+num2+num3));
	}
	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.sum(8, 12);
		obj.sum(5, 5, 10);
	}
}
	
	//Method signature:  name of the method+parameters

 ///can consctructor be overloading ---yes

/*implicit wait — example of overloading (can be minutes, hours etc) 
 * different params
 *driver.get() —> overriding example
 
 *Any method can be overload
we can overload static, final and private method ,both
We can not override static, final and private method

*/


