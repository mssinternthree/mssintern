import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class readExcel {   //same for both Excel and CSV
	public static void main(String...args) throws IOException{
		FileInputStream csvf=new FileInputStream("Machine_readable_file_bd_employ.csv");
		
		int i=csvf.read();
		do {
			if((char)i==',') {
				System.out.print("\t");
			}else {
				System.out.print((char)i);
			}
			i=csvf.read();
		}while(i!=-1);
	}
}