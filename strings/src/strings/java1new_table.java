package strings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class java1new_table {
public static void main(String[] args) throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java1","root","ROOT");
	 PreparedStatement ps=con.prepareStatement("insert into new_table values(2,'anu',20)" );
	 ps.executeUpdate();
	 System.out.println("done");
	 System.out.println("connection established");
	
}
}
