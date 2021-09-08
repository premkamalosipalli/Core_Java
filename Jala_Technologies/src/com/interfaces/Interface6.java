package com.interfaces;

interface InterfaceName6{
	
	default void printable() {
		
		System.out.println("This is a Default Method in the Interface");
	}
}

public class Interface6 implements InterfaceName6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface6 interfaceObject=new Interface6();
		
		interfaceObject.printable();

	}

}
