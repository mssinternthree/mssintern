package mycollections;

import java.io.FileReader;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader("my.properties");

		Properties p = new Properties();
		p.load(reader);

		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("passcode"));
		System.out.println(p.getProperty("model"));
		System.out.println(p.getProperty("series"));

	}

}
