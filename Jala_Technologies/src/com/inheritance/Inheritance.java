package com.inheritance;

class A {

	public void classA() {
		System.out.println("This is First Method in Class A");
	}

	public void methodA() {
		System.out.println("This is Second Method in Class A");
	}

	public void inheritance() {
		System.out.println("This is Override Method in Class A");
	}
}

class B extends A {

	public void classB() {
		System.out.println("This is First Method in Class B");
	}
	
	public void methodB() {
		System.out.println("This is Second Method in Class B");
	}
	
	public void inheritance() {
		System.out.println("This is Override Method in Class B");
	}
}

class C extends B {

	public void classC() {
		System.out.println("This is First Method in Class C");
	}
	
	public void methodc() {
		System.out.println("This is Second Method in Class C");
	}
	
	public void inheritance() {
		System.out.println("This is Override Method in Class C");
	}
}

public class Inheritance {

	public static void main(String[] args) {

		A aObject=new A();
		B bObject=new B();
		C cObject=new C();
		
		aObject.classA();
		aObject.methodA();
		aObject.inheritance();
		
		bObject.classB();
		bObject.methodB();
		bObject.inheritance();
		
		cObject.classC();
		cObject.methodc();
		cObject.inheritance();
		
		A aInstance=new B();
		aInstance.inheritance();
		
		B bInstance=new C();
		bInstance.inheritance();
	}

}
