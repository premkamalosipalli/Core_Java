package com.exceptions;

public class NumberFormatException {

	public static void main(String[] args) {
		
		try {
			int number=Integer.parseInt("Nuber Formate Exception");
			
			System.out.println(number);
		}catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
