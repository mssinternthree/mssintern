package mycollections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class UsingBufferReaderForFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("test.txt");

		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null)
			System.out.println(st);

	}
}
