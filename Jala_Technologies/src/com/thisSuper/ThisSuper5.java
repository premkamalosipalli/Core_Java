package com.thisSuper;

class This5{
	
	This5(){
		
		System.out.println("This is Constructor of Super Class");
	}
}

public class ThisSuper5 extends This5{
	
	ThisSuper5(){	
		super();
	}
	
	public static void main(String[] args) {

		new ThisSuper5();

	}

}
