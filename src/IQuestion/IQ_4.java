package IQuestion;

public class IQ_4 {

	public static void main(String[] args) {
		// How to find out the part of the string from a string? What is substring? 
		
		String str="today is a dark day:)";
		
		System.out.println(str.substring(10));
		
		
		// Find number of words in string?
		System.out.println();
		String [] words=str.split(" ");
		
		
		System.out.println(words.length);
		System.out.println();
		//Write a java program to reverse String? 
		//Reverse a string word by word?
		
		StringBuffer st=new StringBuffer(str);
		System.out.println(st.reverse());
		
		String str2="Where are you from?";
		String temp="";
		
		for(int i=str2.length()-1; i>=0; i-- ) {
			temp+=str2.charAt(i);
			
		}
		System.out.println(temp);
		
		//reverse word by word
		
		String[] word=str.split(" ");
		for (int i=word.length-1; i>=0; i--) {
			System.out.print(word[i] +" ");
		}

	}

}
