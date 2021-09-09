package com.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileReaderReader {

	public static void main(String[] args) throws IOException {

		try {
			FileReader inputStream = new FileReader("resources/read.txt");

			int i = 0;

			while ((i = inputStream.read()) != -1) {

				System.out.print((char) i);

			}

			inputStream.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
