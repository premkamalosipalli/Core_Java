package com.exceptions;

public class ThrowsException {
	
	public static void exception() {
		
		if(10/0!=0) {
			
			throw new ArithmeticException("This is Arithmetic Exception");
		}else{
			
			System.out.println("This is not Arithmetic Exception");
		}
	}

	public static void main(String[] args) {

		exception();

	}

}
