package com.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputReader {

	public static void main(String[] args) throws IOException {

		try {

			FileInputStream file = new FileInputStream("resources/read.txt");

			BufferedInputStream bufferReader = new BufferedInputStream(file);

			int i;

			while ((i = bufferReader.read()) != -1) {

				System.out.print((char) i);

			}

			bufferReader.close();
			file.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
