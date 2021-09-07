package com.arrays;

public class Array3 {
	
	public  static int findIndex(int array[],int element) {
		
		for(int i=0;i<array.length;) {
			if(array[i]==element) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public static void main(String[] args) {

		int array[]= {25,15,34,33,2,41,21};
		
		System.out.println("Finding Index of a Given Element:"+findIndex(array, 33));
		
	}

}
