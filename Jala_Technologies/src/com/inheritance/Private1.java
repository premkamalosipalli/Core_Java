package com.inheritance;

class PrivateModifier {
	
}

class PrivateAccess extends PrivateModifier {

	private int number = 10;

	private void privateModifier() {

		System.out.println("This is Private Method");
	}
}

public class Private1 {

	public static void main(String[] args) {

		PrivateModifier privateModifier = new PrivateAccess();

		//System.out.println(privateModifier.number);
		
		//privateModifier.privateModifier();
	}

}
