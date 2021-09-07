package com.arrays;

public class Array4 {

	public static boolean contains(int array[], int element) {

		boolean flag=false;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==element) {
				flag=true;
				break;
			}
			flag=false;
		}
		return flag;
	}

	public static void main(String[] args) {

		int array[] = { 25, 15, 34, 33, 2, 41, 21 },element=33;

		if(contains(array, element)) {
			
			System.out.println(element+" is present inside the array");
			
		}else {
			
			System.out.println(element+" is present not inside the array");
			
		}

	}

}
