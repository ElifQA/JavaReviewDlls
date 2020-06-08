package iQuestionMap;

public class Person {
	/* Create a Person class with following private fields: name, lastName, age, salary.
	● Variables should be initialized through constructor.
	● Inside the class also create a method to print user details.
	● In Test Class create a Map that will store key in ascending order. In that map store
	personId and a Person Object. Print each object details.
 */

	
	String name, lastName;
	int age, salary;
	
	Person(String name, String lastName, int age, int salary){
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
		
	}
	void  printDetails() {
		System.out.println("name is :"+name);
		System.out.println("lastname is :"+lastName);
		System.out.println("age is :"+age);
		System.out.println("salary is :"+salary);
	}
	
	
	
	

}
