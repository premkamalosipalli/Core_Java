package com.constructor;

class Constructr{
	
	int Constructr(int num){
		return num;
	}
	
	String Constructr(String name){
		System.out.println();
		return name;
	}
}

public class Constructor4 {

	public static void main(String[] args) {

		Constructr construct=new Constructr();
		
		System.out.println(construct.Constructr("Age:"+23));
		System.out.println(construct.Constructr("Name:"+"Prem Kamal Osipalli"));
	}

}
