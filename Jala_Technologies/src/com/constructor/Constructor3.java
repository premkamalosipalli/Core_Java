package com.constructor;

class Constructorr{
	
	public Constructorr() {
		
		System.out.println("This is Default Constructor");
	}
	
	/*private Constructorr(String name) {
		
		System.out.println("Name:"+name);
	}*/
	
	protected Constructorr(String name,int age) {
		
		System.out.println("Name:"+name+"\nAge:"+age);
	}
	
	/*default Constructorr(String name,int age,int number) {
		
		System.out.println("Name:"+name+"\nAge:"+age+"\nNumber:"+number);
	}*/
}

public class Constructor3 {

	public static void main(String[] args) {

		new Constructorr();
		
		//new Constructorr("Prem Kamal Osipalli");
		
		new Constructorr("Prem Kamal Osipalli",23);
		
		//new Constructorr("Prem Kamal Osipalli",23,121);

	}

}
