package files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class DbProperties {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo =new FileOutputStream("db.properties");
		Properties p=new Properties();
		p.setProperty("url", " ");
		p.setProperty("user", "root");
		p.setProperty("password", "root");
		p.store(fo,"commit");

	}

}
