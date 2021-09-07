package com.statics;

public class Static1 {

	static String name = "Prem Kamal Osipali";

	static int age = 23;

	public String collegeName = "Bapatla Engineering College";

	public double percentage = 85;

	static void helloWorld() {

		System.out.println("Hello World");
	}

	static void helloEveryOne() {

		System.out.println("Hello EveryOne");
	}
	
	public void helloMyself() {
		
		System.out.println("Hello HelloMyself");
		
	}
	
	public void helloAll() {
		
		System.out.println("Hello HelloAll");
		
	}

	public static void main(String[] args) {

		Static1 myObject=new Static1();
		
		myObject.helloMyself();
		myObject.helloAll();
		
		helloWorld();
		helloEveryOne();
		
		System.out.println("College Name:"+myObject.collegeName);
		System.out.println("Percentage:"+myObject.percentage);
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}

}
