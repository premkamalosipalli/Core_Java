package com.arrays;

public class Array10 {
	
	public static void duplicates(int array[]) {
		
		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]==array[j]) {
					
					System.out.println(array[j]);
					
				}
				
			}
			
		}
		
	}

	public static void main(String[] args) {

		int array[]= {11,12,13,12,14,15,11};
		
		System.out.println("Duplicate elements of an Array:");
		
		duplicates(array);
		
		
	}

}
