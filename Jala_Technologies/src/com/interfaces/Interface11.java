package com.interfaces;

interface Interface111{
	
	static String name="Prem Kamal Osipalli";
	
	final int number=21;	
}

/*
 * private interface Interface9{
 * 		String name="Prem Kamal Osipalli";
 * 		int number=21;
 * }
 * 
 * interface Interface91{
 * 		private String name="Prem Kamal Osipalli";
 * 		protected int number=21;
 * 		public age=21;
 * }
 * */

public class Interface11 implements Interface111{

	public static void main(String[] args) {
		
		System.out.println("Name:"+name);
		
		System.out.println("Number:"+number);
	}

}
