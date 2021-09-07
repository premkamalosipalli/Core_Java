package com.arrays;

import java.util.Arrays;

public class Array6 {
	
	public static int[] copyArray(int array[]) {
		
		int new_array[]=new int[array.length];
		
		for(int i=0,j=0;i<array.length;i++,j++) {
			
			new_array[j]=array[i];
			
		}
		
		return new_array;
		
	}

	public static void main(String[] args) {
		
		int array[] = { 25, 15, 34, 33, 2, 41, 21 };
		
		System.out.println("Origianal Array:" + Arrays.toString(array));

		System.out.println("Copied Array:" + Arrays.toString(copyArray(array)));


	}

}
