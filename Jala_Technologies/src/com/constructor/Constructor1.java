package com.constructor;

class Constructor{
	
	Constructor(){
		
		System.out.println("Hello Every One");
	}
	
	Constructor(String name){
		
		System.out.println("Name:"+name);
	}
	
	Constructor(String college,int age){
		
		System.out.println("College:"+college+"\nAge:"+age);
	}
}

public class Constructor1 {

	public static void main(String[] args) {

		new Constructor();
		
		new Constructor("Prem Kamal Osipalli");
		
		new Constructor("Bapatla Engineering College",23);

	}

}
