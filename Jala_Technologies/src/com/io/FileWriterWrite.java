package com.io;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterWrite {

	public static void main(String[] args) throws IOException {
		
		try {

			String string="Hii My name is Prem Kamal Oispalli";
			FileWriter outputStream = new FileWriter("resources/write.txt");
			
			outputStream.write(string);

			System.out.println("write has completed please check your file");
			outputStream.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
