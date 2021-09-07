package com.arrays;

public class Array8 {

	public static void findMinMax(int array[]) {
		
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
		System.out.println("The minimum array element is:"+array[0]);
		
		System.out.println("The maximum array element is:"+array[array.length-1]);

	}

	public static void main(String[] args) {

		int array[] = { 25, 15, 34, 33, 2, 41, 21 };
		
		findMinMax(array);

	}

}
