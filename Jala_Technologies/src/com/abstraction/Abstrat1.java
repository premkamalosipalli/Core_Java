package com.abstraction;

abstract class Sample{
	
	abstract void abstractMethod();
	
	void normalMethod() {
		
		System.out.println("This is Normal Method");
	}
}

class SampleAccess extends Sample{
	
	@Override
	void abstractMethod() {

		super.normalMethod();
		
	}
	
}
public class Abstrat1 extends Sample {

	public static void main(String[] args) {
		
		Abstrat1 abstractObject=new Abstrat1();
		
		abstractObject.abstractMethod();
		abstractObject.normalMethod();
	}

	@Override
	void abstractMethod() {

		System.out.println("This is Abstract Method");
		
	}

}
