package com.arrays;

public class Array17 {
	
	public static boolean findElements(int array[]) {
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]==12 && array[i]==23) {
				
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {

		int array[] = { 12, 15, 34, 33, 2, 41, 21 };

		if(findElements(array)) {
			
			System.out.println("Array contains two specified elements(12,23)");
		}else {
			
			System.out.println("Array does not contains two specified elements(12,23)");
		}

	}

}
