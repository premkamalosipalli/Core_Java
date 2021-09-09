package com.exceptions;

import java.util.Scanner;

public class IOException {

	public static void main(String[] args) {
		
		try{
			Scanner scan=new Scanner("IOException");
			
			System.out.println(scan.next());
	        
	    } catch (Exception e){
	    	
	        System.out.println(e);
	    }

	}

}
