package com.basics;

public class Operators {

	double firstValue = 20, secondValue = 5;

	public void arthamaticOperation() {

		System.out.println("Addition Operator:" + (firstValue + secondValue));

		System.out.println("Subtraction Operator:" + (firstValue - secondValue));

		System.out.println("Multiplication Operator:" + (firstValue * secondValue));

		System.out.println("Division Operator:" + (firstValue / secondValue));

		System.out.println("Increment Operator:" + (firstValue++));

		System.out.println("Decrement Operator:" + (firstValue++));

	}

	public void equalAndNotEqual() {

		System.out.println("Equal Operator:" + (firstValue == secondValue));

		System.out.println("Not Equal Operator:" + (firstValue != secondValue));

	}

	public void equalOrNot() {

		if (firstValue == secondValue) {
			
			System.out.println("Both are Equal");
			
		} else {
			
			System.out.println("Both are Not Equal");
			
		}

	}

	public void logicalOperators() {
		
		if((firstValue<secondValue)&&(firstValue==secondValue)){
			
			System.out.println("Both conditions are Equal");
			
		}else if( firstValue<secondValue || firstValue!=secondValue ){
			
			System.out.println("Any condition is Equal");
			
		}else{
			
			System.out.println("Not First Number less than Second Number"+!(firstValue<secondValue));
			
		}
	}
	
	public void ralationalOperators() {
		
		if(firstValue<secondValue) {
			
			System.out.println("First Number less than Second Value");
			
		}else if(firstValue<=secondValue) {
			
			System.out.println("First Number less than or equal to Second Value");
			
		}else if(firstValue>=secondValue) {
			
			System.out.println("First Number greater than or equal to Second Value");
			
		}else if(firstValue>secondValue) {
			
			System.out.println("First Number greater than Second Value");
			
		}
	}
	
	public void smallOrLarge() {
		
		if(firstValue<secondValue) {
			
			System.out.println("First Number is Smaller");
			
		}else {
			
			System.out.println("Second Number is Smaller");
			
		}
	}

	public static void main(String[] args) {

		Operators myObject = new Operators();

		myObject.arthamaticOperation();
		
		myObject.equalAndNotEqual();
		
		myObject.equalOrNot();
		
		myObject.logicalOperators();
		
		myObject.ralationalOperators();
		
		myObject.smallOrLarge();

	}

}
