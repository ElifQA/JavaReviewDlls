package com.review04;

public class Exercise {

	public static void main(String[] args) {
		//print all the words in reverse in a string without changing
		
		String str="Tomorrow will be sunny";
		String [] words=str.split(" ");
		
		for(String word:words) {
	char[] chrArr=word.toCharArray();
			
			for(int i=chrArr.length-1; i>=0; i--) {
				System.out.print(chrArr[i]);
			}
			System.out.print(" ");
		}
		System.out.println();
		
		for (String word:words) {
			for(int i=word.length()-1; i>=0; i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
			
		
		}
		System.out.println();
		String str3 = "How are you?";
        String reversed ="";

        for(int i= str3.length()-1 ; i>=0; i--){
            reversed+= str3.charAt(i);
        }

        System.out.println(reversed);



		}

	}


