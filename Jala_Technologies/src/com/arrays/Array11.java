package com.arrays;

public class Array11 {

	public static void commonElements(int array[], int new_array[]) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < new_array.length; j++) {

				if (array[i] == new_array[j]) {

					System.out.println(array[i]);

				}

			}

		}

	}

	public static void main(String[] args) {

		int array[] = { 22,13,41,55 }, new_array[] = { 1,5,22,12,45,41,65,55 };
		
		System.out.println("Common Elements in an Array:");

		commonElements(array, new_array);

	}

}
