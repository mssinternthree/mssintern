import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class select {
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Scanner t = new Scanner(System.in);
			System.out.println("enter id and name");
			int id =t.nextInt();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			PreparedStatement s = con.prepareStatement("select * from mit where id=?");
			
			s.setInt(1, id);
			ResultSet r = s.executeQuery();
			
			while (r.next()) {
				System.out.println(r.getInt(1)+" "+r.getString(2));
			}
			con.close();
			System.out.println("success");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}