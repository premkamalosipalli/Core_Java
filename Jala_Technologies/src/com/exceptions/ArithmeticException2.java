package com.exceptions;

public class ArithmeticException2 {

	public static void main(String[] args) {

		int number = 121, divisible = 0;
		
		try {
			
		System.out.println("Arithmetic Exception:" + (number / divisible));
		
		}catch(ArithmeticException exp) {
			
			System.out.println("Exception:"+exp);
		}

	}

}
