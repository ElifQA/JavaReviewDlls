package com.review05;

public class Recap {

	public static void main(String[] args) {
		String ex="Even as some countries tentatively lift coronavirus restrictions, "
				+ "more than half the world’s population is still subject to some form of "
				+ "mandatory confinement, and governments are facing pressure to ease lockdowns. "
				+ "Protests have erupted from Paris and Mumbai to Beirut and Baghdad, and rallies "
				+ "demanding the end of stay-at-home orders are spreading across the United States.";
		
		String[] frequency=ex.split("");
		int count=0;
		
		for(String s:frequency) {
			if(s.toLowerCase().equals("e")) {
				count++;
			}
		}
		
		System.out.println("E is repeated "+count+" times");


		
		String ex2= " i love java , i love java, i love java ";
        int count2=0;
        for (int i = 0; i <ex2.length() ; i++) {
            if (ex2.substring(i).startsWith("java")){
                count2++;
            }
        }

        System.out.println("java " + count2);




    }

	}


