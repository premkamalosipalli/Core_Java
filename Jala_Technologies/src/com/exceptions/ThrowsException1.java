package com.exceptions;

@SuppressWarnings("serial")
class UserDefinedException extends Exception{

	public UserDefinedException(String str) {
		
		super(str);
	}
}
public class ThrowsException1 {

	public static void main(String[] args) {
		
		try {
			
			throw new UserDefinedException("This is UserDefinedException");
			
		}catch(UserDefinedException exp) {
			
			System.out.println(exp.getMessage());
		}
		

	}

}
