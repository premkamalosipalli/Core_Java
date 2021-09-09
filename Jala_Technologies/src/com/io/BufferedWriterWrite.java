package com.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterWrite {

	public static void main(String[] args) throws IOException {
		
		String string="Hii My name is Prem Kamal Oispalli";
		
		FileWriter writer = new FileWriter("resources/write.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    
	    buffer.write(string);  
	    buffer.close();  
	    
	    System.out.println("Success"); 

	}

}
