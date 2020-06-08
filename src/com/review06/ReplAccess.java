package com.review06;

public class ReplAccess {
	private int batch=3;
	private String name="SyntaxSolutions";
	
	private  void display() {
		System.out.println(batch);
		System.out.println(name);
		
		}
	private String prvt() {
		String s="private";
		return s;
		
	}
	String def() {
		String d="default";
		return d;
	}
	protected String protcted() {
		String p="protected";
		return p;
	}
	public String pblc() {
		String pb="public";
		return pb;
	}
	

	public static void main(String[] args) {
		ReplAccess obj=new ReplAccess();
		
		System.out.println(obj.prvt()+","+obj.def()+","+obj.protcted()+","+obj.pblc());
		
		obj.display();

	}

}
