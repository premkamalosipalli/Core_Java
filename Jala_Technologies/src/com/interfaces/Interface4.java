package com.interfaces;

interface InterfaceName41{
	
	void printable();
}

interface InterfaceName42{
	
	void printables();
}

public class Interface4 implements InterfaceName41,InterfaceName42{

	public static void main(String[] args) {

		Interface4 interfaceObject=new Interface4();
		
		interfaceObject.printable();
		interfaceObject.printables();

	}

	@Override
	public void printables() {
		// TODO Auto-generated method stub
		System.out.println("This is second implemented method");
		
	}

	@Override
	public void printable() {
		// TODO Auto-generated method stub
		System.out.println("This is first implemented method");
		
	}

}
