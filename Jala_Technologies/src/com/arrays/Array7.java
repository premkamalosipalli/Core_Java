package com.arrays;

import java.util.Arrays;

public class Array7 {
	
	public static int[] insertElement(int array[],int key,int index) {
		
		int result[]=new int[array.length+1];
		
		for(int i=0,j=0;i<array.length;i++,j++) {
			
			if(i==index) {
				result[j]=key;
				j++;
			}
			result[j]=array[i];
		}
		return result;
	}

	public static void main(String[] args) {

		int array[] = { 25, 34, 33, 2, 41, 21 },key=15,index=3;
		
		System.out.println("Before inserting element in an array:" + Arrays.toString(array));

		System.out.println("After inserting element in an array:" + Arrays.toString(insertElement(array,key,index)));

	}

}
