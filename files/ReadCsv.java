package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReadCsv {

	public static void main(String[] args) throws IOException {
		FileInputStream fo =new FileInputStream("test.csv");
		
		int ch; 
		  while ((ch = fo.read()) != -1) {
			  if((char)ch==',')
	        	{
	        		System.out.print("\t");
	        		continue;
	        	}	
	         System.out.print((char)ch); 
		    
		  }
		 

	}

}
