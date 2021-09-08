package com.interfaces;

interface InterfaceName71{
	
	void printable();
}

interface InterfaceName72 extends InterfaceName71{
	
	void printables();
}

public class Interface7 implements InterfaceName72{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface7 interfaceObject=new Interface7();
		
		interfaceObject.printable();
		interfaceObject.printables();

	}

	@Override
	public void printable() {
		// TODO Auto-generated method stub
		System.out.println("This is First Interface Method");
		
	}

	@Override
	public void printables() {
		// TODO Auto-generated method stub
		System.out.println("This is Second Interface Method");
		
	}

}
