package com.review01;

public class SwitchExp {

	public static void main(String[] args) {
		
		int day=3;
		String Workday;
		if(day==1) {
			Workday="Monday";
		}else if(day==2) {
			Workday="tuesday";
		}else if(day==3) {
			Workday="wednesday";
		}else {
			Workday="invalid";
		}
		
			System.out.println(Workday);
		
		int days = 2;
		String workd;
		switch (days) {

		case 1:
			workd = "monday";
			break;
		case 2:
			workd = "tuesdy";
			break;
		case 3:
			workd = "wedns";
			break;
		default:
			workd = "invalid";
		}
		System.out.println(workd);

		/*
		 * Ask user to enter their country and capture it.Once values are captured print
		 * which languageuser speaks.
		 */

		String country = "usa";
		String lang;

		switch (country) {

		case "usa":
			lang = "english";
			break;
		case "england":
			lang = "british";
			break;
		case "germany":
			lang = "almanca";
			break;
		default:
			lang = "dont know";
		}

		System.out.println(lang);

	}

}
