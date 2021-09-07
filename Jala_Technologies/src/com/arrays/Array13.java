package com.arrays;

import java.util.Arrays;

public class Array13 {
	
	public static int secondLargest(int array[],int size) {
		
		int temp=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		
		System.out.println("Sorted elements of an Array:"+Arrays.toString(array));
		
		return array[1];
	}

	public static void main(String[] args) {

		int array[]= { 21, 41, 1, 22, 72, 4},length=array.length;
		
		System.out.println("Second Largest element in Array:"+secondLargest(array,length));

	}

}
