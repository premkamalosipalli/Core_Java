package com.constructor;

class Construct{
	
	Construct(){
		
		System.out.println("Hello Every One");
	}
	
	Construct(String name){
		
		System.out.println("Name:"+name);
	}
}

class Construct1 extends Construct{
	
	Construct1(){
		
		super();
	}
	
	Construct1(String name){
		
		super(name);
	}
	
}

public class Constructor2 {

	public static void main(String[] args) {

		new Construct1();
		new Construct1("Prem Kamal Oispalli");

	}

}
