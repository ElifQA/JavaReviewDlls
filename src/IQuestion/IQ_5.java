package IQuestion;

public class IQ_5 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		//prime number 2, 3 5 7 11 13 17 19 23 29 kendisne ve 1 bolunebilen

		int num=13;
		
		boolean isPrime=true;
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is NOT a prime number");
		
		}
		
		
		// find all prime numbers between 2 and 100
		
				for(int i=1; i<100; i++) {
					boolean isPrm=true;
					
					for(int j=2; j<i; j++) {
						if(i%j==0) {
							isPrm=false;
							break;
						}
					}			
					if(isPrm) {
						System.out.print(i+" ");
					}				
				}


	
		}}

