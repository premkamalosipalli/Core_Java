package com.basics;

//class is created using class keyword followed by name of the class here the class name is "Basics"
public class Basics {

	/*
	 * Global Variable which is used any where inside the class. Scope of the global
	 * variable is with the class.
	 */
	int globalVariabel = 100;

	// Variables:These are containers which are used to store data values.
	int myNum = 1;
	boolean myBool = true;
	char myLetter = 'D';
	float myFloatNum = 5.99f;
	double myDoubleNum = 19.9;

	// A method in java is block of statements which are executed when the method is
	// called by the object of the class
	public void myMethod() {

		/*
		 * Creating a Local Variable inside a method and the score of this variable is
		 * within the method. Scope of the local variable is with the method.
		 */
		int localVariabel = 10;
		System.out.println("Accessin Local Variabel inside the method:" + localVariabel);

		// Accessing Global Variables inside a method.
		System.out.println("Accessin Global Variabel inside the method:" + globalVariabel);

		// This is the statement which is used to print my name.
		System.out.println("Hello my name is Prem kamal");
	}

	public static void main(String[] args) {
		// Object is an instance of class here the name of the object is "myObject"
		Basics myObject = new Basics();

		// calling a variable using the instance of class
		System.out.println("Integer:" + myObject.myNum + "\nBoolean:" + myObject.myBool + "\nCharacter:"
				+ myObject.myLetter + "\nFloat:" + myObject.myFloatNum + "\nDouble:" + myObject.myDoubleNum);

		// calling the method by the object of the class
		myObject.myMethod();

		// Accessing Global Variables inside a Main Method but we cannot access local
		// variable.
		System.out.println("Accessin Global Variabel inside the method:" + myObject.globalVariabel);
	}

	// This are single line comments which is used to comment only one line of the
	// code.

	/*
	 * This is multiline comment Which are used to for commenting multiple lines in
	 * a program.
	 */

	/**
	 *
	 * This is Documentation comment used to write large programs for a project or
	 * software application as it helps to create documentation API
	 *
	 */
}
