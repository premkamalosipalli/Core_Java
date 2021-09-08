package com.accessModifiers;

class PublicAccess{
	
	String publicVariabel="Default Variable";
	
	void publicMethod() {
		
		System.out.println("Default Method");
	}
}

public class Public {

	public static void main(String[] args) {

		PublicAccess publicAccess=new PublicAccess();
		
		System.out.println(publicAccess.publicVariabel);

		publicAccess.publicMethod();
	}

}
