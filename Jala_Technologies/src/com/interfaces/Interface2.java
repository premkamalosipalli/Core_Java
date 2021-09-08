package com.interfaces;

interface InterfaceName2{
	
	void printables();
	void printable();
}

public class Interface2 implements InterfaceName2{

	public static void main(String[] args) {

		Interface2 interfaceObject= new Interface2();

		interfaceObject.printables();
	}

	@Override
	public void printables() {
		// TODO Auto-generated method stub
		System.out.println("This is the implemented method");
		
	}

	@Override
	public void printable() {
		// TODO Auto-generated method stub
		
	}

}
