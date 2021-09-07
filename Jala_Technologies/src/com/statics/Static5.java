package com.statics;

public class Static5 {
	
	public static void staticMethod() {
		
		System.out.println("Static Method");
	}
	
	public void instanceMethod() {
		
		staticMethod();
	}

	public static void main(String[] args) {

		Static5 myObject=new Static5();
		
		myObject.instanceMethod();

	}

}
