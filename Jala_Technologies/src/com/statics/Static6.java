package com.statics;

public class Static6 {
	
	static String name = "Prem Kamal Osipali";

	static int age = 23;

	public String collegeName = "Bapatla Engineering College";

	public double percentage = 85;

	public static void main(String[] args) {
		
		Static6 myObject=new Static6();

		System.out.println("College Name:"+myObject.collegeName);
		System.out.println("Percentage:"+myObject.percentage);
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);

	}

}
