package com.review08;

public class CarsTest {
//overriding 
	//main method final static private cannot override
	public static void main(String[] args) {
		Cars car=new Cars ();
		car.speed(140);
		Toyota tyt=new Toyota();
		tyt.speed(160);
		Cars car2=new Toyota();
		//Toyota car3=(Toyota)

	}

}
