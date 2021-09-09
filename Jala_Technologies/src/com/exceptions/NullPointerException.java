package com.exceptions;

public class NullPointerException {

	public static void main(String[] args) {

		String nullValue=null;
		try {
			
			if(nullValue.equals("null")) {
				
				System.out.println("Sample");
			}else {
				
				System.out.println("Not Sample");
			}
		}catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
