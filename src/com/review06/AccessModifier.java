package com.review06;

public class AccessModifier {


		public String schoolName;
		protected String studentName;
		static String studentGrade;
		private String studentSSN;
		
		public static void main(String[]args) {

			AccessModifier stu=new AccessModifier();
			
			stu.schoolName="UTD";
			stu.studentName="mike brown";
			studentGrade="A";
			stu.studentSSN="12-365-52";

	}

}
