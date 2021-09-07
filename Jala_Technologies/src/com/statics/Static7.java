package com.statics;

public class Static7 {

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

		Static1 myObject = new Static1();

		myObject.helloMyself();
		myObject.helloAll();

		helloWorld();
		helloEveryOne();

	}

}
