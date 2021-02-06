package files;
import java.io.*;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		FileInputStream fo =new FileInputStream("local.properties");
		Properties p = new Properties();
		p.load(fo);
		System.out.println("username: "+p.getProperty("username"));
		System.out.println("password: "+p.getProperty("password"));
	}
}