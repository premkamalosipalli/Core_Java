package com.loops;

public class Loops9 {

	public static void main(String[] args) {

		int number=11;
		boolean flag=false;
		
		if(number==0||number==1) {
			flag=true;
		}
		
		for(int i=2;i<=number/2;i++) {
			
			if(number%i==0) {
				
				flag=true;
				break;
			}
			
		}
		
		if(!flag) {
			
			System.out.println("Prime Number");
			
		}else {
			
			System.out.println("Not Prime Number");
			
		}

	}

}
