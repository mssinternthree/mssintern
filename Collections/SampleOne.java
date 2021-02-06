import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SampleOne {
	public static void main(String...args) throws IOException{
		FileOutputStream fo= new FileOutputStream("sample.txt");
		
		String sample="hello";
		
		byte[] b=sample.getBytes();
		fo.write(b);
		
		FileInputStream fi=new FileInputStream("sample.txt");
		int i=fi.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fi.read();
		}
		
	}
}
