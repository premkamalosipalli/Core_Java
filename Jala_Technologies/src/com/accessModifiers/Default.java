package com.accessModifiers;

class DefaultAccess{
	
	String defaultvariabel="Default Variable";
	
	void defaultMethod() {
		
		System.out.println("Default Method");
	}
}

public class Default {

	public static void main(String[] args) {

		DefaultAccess defaultAccess=new DefaultAccess();
		
		System.out.println(defaultAccess.defaultvariabel);
		
		defaultAccess.defaultMethod();

	}

}
