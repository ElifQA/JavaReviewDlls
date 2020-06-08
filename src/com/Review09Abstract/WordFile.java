package com.Review09Abstract;

public class WordFile extends File {

	@Override
	public void open() {
	System.out.println("wordfile ");
		
	}
	
public static void main(String[] args) {
	File file =new WordFile();
	file.close();
	file.edit();
	file.open();
	
	File file1=new JavaFile();
	file1.close();
	file1.edit();
	file1.open();
}
}
