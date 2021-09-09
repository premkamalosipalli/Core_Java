package com.exceptions;

public class StringIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		try {
			
			char character="sample".charAt(-1);
			
			System.out.println(character);
		}catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
