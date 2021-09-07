package com.arrays;

import java.util.Arrays;

public class Array18 {

	public static int[] deleteDuplicates(int array[]) {

		if (array.length == 0 || array.length == 1) {
			return array;
		}

		int temp[] = new int[array.length], j = 0;

		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] != array[i + 1]) {

				temp[j++] = array[i];
			}
		}
		temp[j++] = array[array.length - 1];

		for (int i = 0; i < j; i++) {

			array[i] = temp[i];
		}
		return array;

	}

	public static void main(String[] args) {

		int array[] = { 11, 12, 13, 12, 14 }, temp;

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("Sorted elements of an Array:" + Arrays.toString(array));

		System.out.println("After Deleting Duplicate elements of an Array:");
		
		int[] new_array=deleteDuplicates(array);

		for (int i = 0; i < new_array.length-1; i++) {

			System.out.println(array[i]);
		}
	}

}
