package com.exceptions;

import java.io.File;
import java.io.FileInputStream;

public class FileNotFoundException {

	public static void main(String[] args) {

		File file=new File("C:/Java2blog.txt");
		
		try {
			
		FileInputStream inputStream=new FileInputStream(file);
		
		System.out.println(inputStream);
		
		}catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
