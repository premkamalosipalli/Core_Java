package com.interfaces;

interface InterfaceName51{
	
	void printable();
}

interface InterfaceName52{
	
	void printable();
}

public class Interface5 implements InterfaceName51,InterfaceName52{

	public static void main(String[] args) {

		Interface5 interfaceObject=new Interface5();
		
		interfaceObject.printable();

	}

	@Override
	public void printable() {
		// TODO Auto-generated method stub
		System.out.println("This is Common implemented method");
		
	}

}
