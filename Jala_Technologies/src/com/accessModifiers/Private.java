package com.accessModifiers;

class Private {

	private void privateMethod() {

		System.out.println("Private Method");
	}

	public static void main(String[] args) {

		Private	privateAccess=new Private();
		
		privateAccess.privateMethod();

	}

}
