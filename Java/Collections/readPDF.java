import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class readPDF {   
	public static void main(String...args) throws IOException{
		FileInputStream pdf=new FileInputStream("sample.pdf");
		
		int i=pdf.read();
		do {
			if((char)i==',') {
				System.out.print("\t");
			}else {
				System.out.print((char)i);
			}
			i=pdf.read();
		}while(i!=-1);
	}
}