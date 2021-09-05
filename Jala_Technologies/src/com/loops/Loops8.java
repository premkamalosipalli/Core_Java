package com.loops;

public class Loops8 {

	public static void main(String[] args) {

		int value=131,reminder,Number,result=0;
		
		Number=value;
		
		while(Number!=0) {
			
			reminder=Number%10;
			result=(int) (result+Math.pow(reminder, 3));
			Number=Number/10;
		}
		
		if(result == value) {
			
            System.out.println(value + " is an Armstrong number.");
            
		}else {
			
            System.out.println(value + " is not an Armstrong number.");
            
		}
	}

}
