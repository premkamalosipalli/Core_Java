package com.accessModifiers;

import com.inheritance1.Protect;

class ProtectedAccess{
	
	protected String protectedVariabel="Protected Variabel";
	
	protected void protectedMethod() {
		
		System.out.println("Protected Method");
	}
}

public class Protected extends Protect{

	public static void main(String[] args) {

		ProtectedAccess protectedAccess=new ProtectedAccess();
		
		System.out.println(protectedAccess.protectedVariabel);
		
		protectedAccess.protectedMethod();
		
		Protected anotherClass=new Protected();
		
		System.out.println(anotherClass.name);
		
		anotherClass.anotherClass();
	}

}
