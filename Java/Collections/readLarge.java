import java.io.FileReader;
import java.io.IOException;

public class readLarge {
	public static void main(String... args) throws IOException {
		FileReader fread = new FileReader("write.txt");

		int i;
		do {
			i = fread.read();
			System.out.print((char) i);
		} while (i != -1);
	}
}
