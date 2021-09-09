package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WriteOutputStream {

	public static void main(String[] args) throws IOException {

		try {

			String string="Hii My name is Prem Kamal Oispalli";
			File file = new File("resources/write.txt");
			FileOutputStream inputStream = new FileOutputStream(file);

			byte characters[]=string.getBytes();
			
			inputStream.write(characters);

			System.out.println("write has completed please check your file");
			inputStream.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
