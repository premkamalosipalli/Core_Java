package com.inheritance;

class AA {

	String classA="Instance Variable for Class A";
	String methodA="Instance Variable for Method A";
	String inheritance="Override Variable for Class A";
}

class BB extends AA {

	String classB="Instance Variable for Class B";
	String methodB="Instance Variable for Method B";
	String inheritance="Override Variable for Class B";
}

class CC extends BB {

	String classC="Instance Variable for Class C";
	String methodC="Instance Variable for Method C";
	String inheritance="Override Variable for Class C";
}

public class Inheritance1 {

	public static void main(String[] args) {

		AA aObject=new AA();
		BB bObject=new BB();
		CC cObject=new CC();
		
		System.out.println(aObject.classA);
		System.out.println(aObject.methodA);
		System.out.println(aObject.inheritance);
		
		System.out.println(bObject.classB);
		System.out.println(bObject.methodB);
		System.out.println(bObject.inheritance);
		
		System.out.println(cObject.classC);
		System.out.println(cObject.methodC);
		System.out.println(cObject.inheritance);
	}

}
