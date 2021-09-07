package com.statics;

public class Static2 {
	
	String name="Prem Kamal Osipalli";
	
	static void helloWorld() {
		
		Static2 myObject=new Static2();
		System.out.println("Name:"+myObject.name);
	}

	public static void main(String[] args) {

		helloWorld();
	}

}
