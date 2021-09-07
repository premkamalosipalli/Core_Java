package com.arrays;

public class Array16 {

	public static void differenceArray(int array[]) {

		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}
		}
		System.out.println("Difference of largest and smallest value:" + ((array[array.length - 1])-(array[0])));

	}

	public static void main(String[] args) {

		int array[] = { 25, 15, 34, 33, 2, 41, 21 };

		differenceArray(array);
	}

}
