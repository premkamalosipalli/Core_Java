package com.exceptions;

public class ClassNotFoundException {

	public static void main(String[] args) {

		try {
			
			Class.forName("sample");
		}catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
