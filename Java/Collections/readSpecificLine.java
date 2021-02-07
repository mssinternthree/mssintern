import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class readSpecificLine {
	public static void main(String... args) throws IOException {
		FileReader fread = new FileReader("write.txt");
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a line to print :");
		int rline = in.nextInt();
		int i;
		int line = 0;
		do {
			i = fread.read();
			if (line == rline - 1) {
				System.out.print((char) i);
			}
			if ((char) i == '\n') {
				line++;
			}
		} while (i != -1);
	}

}
