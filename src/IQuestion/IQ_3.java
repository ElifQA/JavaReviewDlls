package IQuestion;

public class IQ_3 {

	public static void main(String[] args) {
		
		//Find out how many alpha characters present in a string?
		
		String str="el349@$%^if&*(";
		String s=str.replaceAll("[^A-Za-z0=9]", "");
		System.out.println(s);
	}

}
