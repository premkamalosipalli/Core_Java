package com.arrays;

import java.util.Arrays;

public class Array9 {
	
	public static int[] reverseArray(int array[]) {
		
		int new_array[]=new int[array.length];
		
		int last=array.length-1;
		for(int i=last,j=0;i>=0;i--,j++) {
			
			new_array[j]=array[i];
			
		}
		
		return new_array;
	}

	public static void main(String[] args) {

		int array[]= {11,12,13,14,15,16};
		
		System.out.println("Original Array:"+Arrays.toString(array));
		
		System.out.println("Reverse of Array"+Arrays.toString(reverseArray(array)));

	}

}
