package com.arrays;

public class Array1 {

	public static void main(String[] args) {
		
		int array[]= new int[5],sum=0;

		for(int i=0;i<array.length;i++) {
			
			array[i]=i;
			
		}
		
		for(int i=0;i<array.length;i++) {
			
			sum=sum+array[i];
			
		}
		
		System.out.println("Addition of elements of an array:"+sum);
		
	}

}
