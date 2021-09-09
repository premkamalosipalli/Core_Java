package com.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class BufferedOutputWriter {

	public static void main(String[] args) throws IOException {

		try {

			String string = "Hii My name is Prem Kamal Oispalli";
			FileOutputStream file = new FileOutputStream("resources/write.txt");

			BufferedOutputStream bufferReader = new BufferedOutputStream(file);

			byte characters[] = string.getBytes();

			bufferReader.write(characters);

			System.out.println("write has completed please check your file");
			bufferReader.close();
			
			bufferReader.flush();

			file.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
