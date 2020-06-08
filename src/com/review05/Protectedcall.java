package com.review05;

import com.review06.AccessModifier;

public class Protectedcall extends AccessModifier {
	
	public static void main(String[] args) {
		Protectedcall obj=new Protectedcall();//create objct subclass
		obj.studentName="asim";//protected ulasabiliyor
		obj.schoolName="granberyy";
		//obj.studentGrade="B";
		
		AccessModifier obj1=new AccessModifier();
		obj1.schoolName="kjh";
		//obj1.studentName="elif"; //protected ulasamiyor subclass tan obj create edilecek
		//obj1.studentGrade="a";//static
		
	}
	

}
