import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFile {
	public static void main(String...args) throws IOException{
		FileReader fr=new FileReader("Sample.txt");
		
		int i;
		do {
			i=fr.read();
			System.out.print((char)i);
		}while(i!=-1);
	}
}
