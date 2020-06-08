package com.review07;

public class Parent {
	
	String sname;
	String  slastname;
	
	Parent(String name, String lastname){
		sname=name;
		slastname=lastname;
	}
	public String studentemail() {
		String email=sname+slastname+" @gmail";
				return email;
	}
}
