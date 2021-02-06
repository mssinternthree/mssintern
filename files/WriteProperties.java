package files;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class WriteProperties {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo =new FileOutputStream("local.properties");
		Properties p=new Properties();
		p.setProperty("username", "saikrishna");
		p.setProperty("password", "iwillnotsay");
		p.store(fo,"commit");
	}

}
