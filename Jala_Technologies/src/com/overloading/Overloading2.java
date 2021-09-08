package com.overloading;

public class Overloading2 {

	public String override(String name) {

		return name;
	}

	public int override(int age) {

		return age;
	}
		
	public static void main(String[] args) {

		Overloading2 overload=new Overloading2();
		
		System.out.println("Name:"+overload.override("Prem Kamal Osipalli"));
		
		System.out.println("Age:"+overload.override(23));

	}

}
