package com.statics;

public class Static3 {
	
	public void instanceMethod() {
		
		System.out.println("Instance Method");
	}
	
	public static void staticMethod() {
		
		Static3 myObject=new Static3();
		
		myObject.instanceMethod();
	}

	public static void main(String[] args) {

		staticMethod();

	}

}
