package com.thisSuper;

class This6{
	
void superMethod() {
		
		System.out.println("This is Super method");
	}
	
}
public class ThisSuper6 extends This6{
	
	void thisMethod() {
		
		System.out.println("This is this method");
	}
	
	void extendThis() {
		
		super.superMethod();
		this.thisMethod();
	}

	public static void main(String[] args) {

		ThisSuper6 thisSuper=new ThisSuper6();

		thisSuper.extendThis();
	}

}
