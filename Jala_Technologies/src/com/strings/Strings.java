package com.strings;

public class Strings {

	public static void main(String[] args) {

		int value=20;
		
		String name="Prem Kamal Osipalli";
		
		char character[]= {'P','R','E','M'};
		
		String naming=new String(character);
		
		String names=new String("KAMAL");
		
		String concatination=name+" is my name";
		
		System.out.println("Name:"+name);
		
		System.out.println("Name:"+naming);

		System.out.println("Name:"+names);
		
		System.out.println("Concatinatoin:"+concatination);
		
		System.out.println("Length of String:"+name.length());
		
		System.out.println("Sub-String:"+name.substring(4, 10));

		System.out.println("IndexOf:"+name.indexOf(2));
		
		System.out.println("Matches:"+names.matches("Kamal"));
		
		System.out.println("Equals:"+"Osipalli".equals(name));
		
		System.out.println("Equals Ignore Case:"+names.equalsIgnoreCase(concatination));
		
		System.out.println("Starts With:"+names.startsWith("P"));
		
		System.out.println("Ends With:"+names.endsWith("i"));
		
		System.out.println("Compare To:"+names.compareTo(concatination));
		
		System.out.println("Trim:"+names);
		
		System.out.println("Replace:"+names.replace('P', 'S'));
		
		System.out.println("Split:"+names.split("rem"));
		
		System.out.println("Value Of:"+String.valueOf(value));
		
		System.out.println("Value Of:"+String.valueOf(value)+100);
		
		System.out.println("Case Sensitive:"+name.toLowerCase());
		
		System.out.println("Case Sensitive:"+name.toUpperCase());
	}

}
