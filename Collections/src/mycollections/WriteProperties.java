package mycollections;

import java.io.FileWriter;
import java.util.Properties;

public class WriteProperties {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//creating object for the class. 
		Properties p = new Properties();
		// Settings 
		p.setProperty("name", "Surya teja");
		p.setProperty("email", "msteja37@gmail.com");
		p.setProperty("model", "new");
		p.store(new FileWriter("my.properties"), "My properties write example");
		System.out.println("write sucessful!");
	}

}
