package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadInputStream {

	public static void main(String[] args) throws IOException {

		try {
			
			File file=new File("resources/read.txt");
			FileInputStream inputStream=new FileInputStream(file);
			 
			int i=0;
			
			while((i=inputStream.read())!=-1) {
				
				System.out.print((char)i);
				
			}
			
			inputStream.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
