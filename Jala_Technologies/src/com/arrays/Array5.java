package com.arrays;

import java.util.Arrays;

public class Array5 {

	public static int[] deleteElement(int array[], int element) {

		int new_array[] = new int[array.length - 1];
		for (int i = 0, k = 0; i < array.length; i++) {
			if (array[i] != element) {
				new_array[k] = array[i];
				k++;
			}
		}
		return new_array;
	}

	public static void main(String[] args) {

		int array[] = { 25, 15, 34, 33, 2, 41, 21 }, element = 33;

		System.out.println("After removing specified element from an array:" + Arrays.toString(array));

		System.out.println("After removing specified element from an array:" + Arrays.toString(deleteElement(array, element)));

	}

}
