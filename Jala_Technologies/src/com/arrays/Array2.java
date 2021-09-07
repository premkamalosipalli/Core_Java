package com.arrays;

public class Array2 {
	
	int array[]=new int[5],sum=0;
	
	public void arrayAddition() {
		
		
		for(int i=0;i<array.length;i++) {
			
			array[i]=i;
			
		}
		
		for(int i=0;i<array.length;i++) {
			
			sum=sum+array[i];
			
		}

		System.out.println("Average of array elements:"+(sum/array.length));
		
	}

	public static void main(String[] args) {

		Array2 myObject=new Array2();
		
		myObject.arrayAddition();

	}

}
