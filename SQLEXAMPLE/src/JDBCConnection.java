import java.sql.*;
import java.util.Scanner;

public class JDBCConnection {
	public static void main(String...args) throws Exception{
		Connection con=null;
		Scanner  s=new Scanner(System.in);
		System.out.println("Enter name and age to add : ");
		String x=s.nextLine();
		int y=s.nextInt();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/samplefirst","root","ashu23456");
			System.out.println("Connection Established!");
//			Connection con=DriverManager.getConnection("jdbc:db2://125.62.213.197:22/db2","itgusr13","miracle13"); what is Scrollable, Scrolable insensitive
			PreparedStatement ps=con.prepareStatement("insert into ashu_first(name,age) value(?,?)");
			ps.setString(1, x);
			ps.setInt(2, y);
			ps.executeUpdate();
			System.out.println("Inserted!");
		}
		catch(Exception e) {
			System.out.println(e);
		}finally{
			con.close();
		}
		
	}
}