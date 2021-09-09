package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderRead {

	public static void main(String[] args) throws IOException {

		FileReader file=new FileReader("resources/read.txt"); 
		
        BufferedReader bufferReader=new BufferedReader(file);    

        int i;    
        while((i=bufferReader.read())!=-1){  
        System.out.print((char)i);  
        }  
        bufferReader.close();    
        file.close();    

	}

}
