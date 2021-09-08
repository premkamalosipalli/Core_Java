package com.interfaces;

interface InterfaceName1{
	
	void printable();
}

public class Interface1 implements InterfaceName1{
	
	public void printable() {
		
		System.out.println("This is the implemented method");
	}

	public static void main(String[] args) {

		Interface1 interfaces=new Interface1();
		
		interfaces.printable();

	}

}
