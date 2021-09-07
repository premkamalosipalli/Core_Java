package com.statics;

public class Static4 {

	public static String name="Prem Kamal Osipalli";
	
	public void instanceMethod() {
		
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		Static4 myObject=new Static4();
		
		myObject.instanceMethod();
	}

}
