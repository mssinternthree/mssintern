package mysql.java;
import java.sql.*;
public class insert {
    public static void main(String[] args) throws Exception
    {
    	Class.forName("com.mysql.jdbc.Driver"); 
    	
    	try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
			PreparedStatement ps1=con.prepareStatement("insert into intern values(3,'Dhileep')");
		   int result= ps1.executeUpdate();
			System.out.println(result);
			if(result>0)
			{
				System.out.println("execution Done");
			}
			else {
				System.out.println("Check your query again");
			}
			//System.out.println("Connection Established");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
    }
}
