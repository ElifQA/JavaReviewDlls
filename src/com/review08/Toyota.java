package com.review08;

public class Toyota  extends Cars{
	//method overriding
	@Override
	public void  speed (int speed) {
		System.out.println("Top speed of toyota is   "+speed);
	}
	@Override //yazip check edilbilir
	public void price(int price) {
		System.out.println("Price of toyota is "+price);
	}

}
