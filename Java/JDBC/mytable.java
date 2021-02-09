import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class mytable {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			PreparedStatement s = con.prepareStatement("insert into mit values(2,'bhuvan')");
			int i = s.executeUpdate();
			System.out.print(i);
			con.close();
			System.out.println("success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
