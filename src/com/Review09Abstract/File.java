package com.Review09Abstract;
/*
 * 
 */

public abstract class File {
//	static int a=32;
//	final int b=4;
	private int c=8;
	
	public abstract void open();
	
	public void edit () {
		System.out.println("File is edited");
	}
	public void close() {
		System.out.println("file is closed");
		
	}
	

}
