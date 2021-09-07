package com.arrays;

import java.util.Arrays;

public class Array12 {

	public static int deleteDuplicates(int array[],int size) {
		
		if(size==0 || size==1) {
			return size;
		}
		
		int temp[]=new int[size],j=0;
		
		for(int i=0;i<size-1;i++) {
			
			if(array[i]!=array[i+1]) {
				
				temp[j++]=array[i];
			}
		}
		temp[j++]=array[size-1];
		
		for(int i=0;i<j;i++) {
			
			array[i]=temp[i];
		}
		
		return j;

	}

	public static void main(String[] args) {

		int array[] = { 11, 12, 13, 12, 14, 15, 11, 11 },length=array.length,temp;
		
		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]>array[j]) {
					
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}

		System.out.println("Sorted elements of an Array:"+Arrays.toString(array));
		
		System.out.println("After Deleting Duplicate elements of an Array:");

		length=deleteDuplicates(array,length);
		
		System.out.print("[");
		
		for(int i=0;i<length;i++) {
			
			System.out.print(array[i]+" ");
		}

		System.out.print("]");
	}

}
