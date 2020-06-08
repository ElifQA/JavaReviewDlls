package com.Review10Interface;

//repl176
public interface ParentInterface {
	public void parentMethod() ;
		
	

}
interface Child extends ParentInterface{
	void childMethod();
	
}
class Main implements Child{

	@Override
	public void parentMethod() {
		System.out.println("Parent Method-----welcome to syntax solutions");
		
	}

	@Override
	public void childMethod() {
		// TODO Auto-generated method stub
		System.out.println("Child Method-----hi syntax solutions how are you");
	}
	
	
}