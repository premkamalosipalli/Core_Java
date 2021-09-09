package com.io;

import java.io.*;
import java.util.*;

public class PropertiesExample {

	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("src/user.properties");

		Properties property = new Properties();
		property.load(reader);

		System.out.println(property.getProperty("user"));
		System.out.println(property.getProperty("password"));

	}

}
