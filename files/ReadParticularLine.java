package files;

import java.io.*;
import java.util.Scanner;

public class ReadParticularLine {

	public static void main(String[] args) throws IOException {
	FileInputStream fo =new FileInputStream("test.txt");
		
		int ch,line=0; 
		  while ((ch = fo.read()) != -1) {
			  if((char)ch=='\n')
	        	{
	        		line++;
	        		
	        	}	
			  if(line==4) {
				  System.out.print((char)ch); 
			  }
	        // System.out.print((char)ch); 
		    
		  }
	}

}
