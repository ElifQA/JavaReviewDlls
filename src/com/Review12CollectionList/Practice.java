package com.Review12CollectionList;

import java.util.LinkedList;

class Sweet{
	String  name;
	
	public Sweet(String name){
		this.name=name;
		
	}
	public void Love(){
		System.out.println("I love "+name);
		
	}
}

public class Practice {

	public static void main(String[] args) {
		LinkedList<Sweet> list=new LinkedList<>();
		list.add(new Sweet ("candy"));
		list.add(new Sweet("macaroons"));
		list.add(new Sweet("choclate"));
		
		for (Sweet i:list) {
			System.out.println(i.name);
			i.Love();
		}
		

	}

}
