package com.thisSuper;

class ThisSuperClass{
	String name="Prem Kamal Osipalli";
}

public class ThisSuper2 extends ThisSuperClass{
	
	String myName=super.name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisSuper2 superObject=new ThisSuper2();
		System.out.println("Name:"+superObject.name);
	}

}
