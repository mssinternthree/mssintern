import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeProps {
	public static void main(String...args) throws IOException{
		FileOutputStream fo= new FileOutputStream("write.txt");
		
		String sample="hello charan";
		
		byte[] b=sample.getBytes();
		fo.write(b);
		
		FileInputStream fi=new FileInputStream("write.txt");
		int i=fi.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fi.read();
		}
		
	}
}
