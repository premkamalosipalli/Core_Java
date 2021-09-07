package com.arrays;

public class Array15 {

	public static void evenAndOdd(int array[], int size) {

		int even=0,odd=0;
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]%2==0) {
				
				even++;
			}else {
				
			odd++;
			}
		}	
		
		System.out.println("Number of Even Elements in an array:"+even);
		
		System.out.println("Number of Even Elements in an array:"+odd);
	}

	public static void main(String[] args) {

		int array[] = { 21, 41, 1, 22, 72, 4 }, length = array.length;

		evenAndOdd(array, length);

	}

}
