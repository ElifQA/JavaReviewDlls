package com.Review11Encapsulation;
/*Create Registration Class in which you would have variables 
 * as email, userName and password that have an access scope only 
 * within its own class. 
 * After creating an object of the class user should be able 
 * to call methods and in each method separately pass values 
 * to set users email, username and password. 
Requirements: 

Valid email consider to be only gmail
Valid userName and password cannot be empty and 
should be of length larger than 6 characters. 
Also valid password cannot contain userName.*/

class Registration {
	private String email, userName, password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		if (email.contains("gmail")) {
			this.email = email;
		}else {
			System.out.println("Invalid mail adress entered");
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (!userName.isEmpty()) {
			if(userName.length()>6) {
				this.userName = userName;
			}else {
				System.out.println("username should have more tahn 6 charachter");
			}
		}else {
			System.out.println("username connot empty");
		}
		
	}

	public String getPassword() {
		
		return password;
	}

	public void setPassword(String password) {
		if (!password.isEmpty() ) {
			if(password.length()>6) {
				if(!password.contains(userName)) {
					this.password = password;	
				}else {
					System.out.println("Paswword cannot contain username");
				
				}
			}else {
				System.out.println("password should have more then 6 charcter");
			}
		}else {
			System.out.println("Password can not be empty");
		}
		
	}
	
	
	
}




public class RegistrationTest {

	public static void main(String[] args) {
	
		Registration obj =new Registration();
	obj.setUserName("elifdemirbuga");
	System.out.println(obj.getUserName());
	obj.setEmail("gmail.com");
	System.out.println(obj.getEmail());
	obj.setPassword("jk5789kl3jukl");
	System.out.println(obj.getPassword());

	}

}
