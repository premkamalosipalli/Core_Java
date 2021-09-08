package com.overloading;

public class Overloading1 {

	public void overload(String name) {

		System.out.println("Name:" + name);
	}

	public void overload(String college,int age) {

		System.out.println("College:"+college+"\nAge:" + age);
	}

	public static void main(String[] args) {

		Overloading1 overide=new Overloading1();
		
		overide.overload("Prem Kamal Osipalli");
		
		overide.overload("Bapatla Engineering College",21);
	}

}
