import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectQuery {
	public static void main(String...args) throws Exception{
		Connection con=null;
		Scanner  s=new Scanner(System.in);
		System.out.println("Enter id  to search : ");
		int x=s.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/samplefirst","root","ashu23456");
			System.out.println("Connection Established!");
//			PreparedStatement ps=con.prepareStatement("select * from ashu_first");
//			ResultSet obj=ps.executeQuery();
//			while(obj.next()) {
//				System.out.println(obj.getInt(1)+" "+obj.getString(2)+" "+obj.getInt(3));
//			}
			PreparedStatement ps=con.prepareStatement("select * from ashu_first  where id=?");
			ps.setInt(1, x);
			ResultSet obj=ps.executeQuery();
			while(obj.next()) {
				System.out.println(obj.getInt(1)+" "+obj.getString(2)+" "+obj.getInt(3));
			}
			System.out.println("Printed!");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}finally{
			con.close();
		}
		
	}
}
