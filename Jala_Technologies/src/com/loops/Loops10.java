package com.loops;

public class Loops10 {

	public static void main(String[] args) {

		int value=1331,reminder,Number,reverse=0;
		
		Number=value;
		
		while(Number!=0) {
			
			reminder=Number%10;
			reverse=reverse*10+reminder;
			Number=Number/10;
		}
		
		if(reverse == value) {
			
            System.out.println(value + " is an Palindrome number.");
            
		}else {
			
            System.out.println(value + " is not an Palindrome number.");
            
		}

	}

}
