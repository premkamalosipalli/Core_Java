package com.interfaces;

interface InterfaceName3{
	
	void printable();
}

public class Interface3 implements InterfaceName3{

	public static void main(String[] args) {

		InterfaceName3 interfaceObject=new Interface3();
		
		interfaceObject.printable();

	}

	@Override
	public void printable() {

		System.out.println("This is implemented method");
		
	}

}
