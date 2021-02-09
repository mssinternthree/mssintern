import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class bankAcc {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner sc = new Scanner(System.in);
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
			System.out.println("Connection to BankDB established successfully");
			System.out.println("Enter Account Holder name:");
			String nm = sc.next();
			System.out.println("Create your pin (Alphanumeric):");
			String pin = sc.next();
			System.out.println("Enter amount to be deposited initially:");
			int bal = sc.nextInt();
			PreparedStatement a = con
					.prepareStatement("INSERT INTO bank (name,pin,balance) VALUES (?,?,?) ");
			a.setString(1,nm);
			a.setString(2, pin);
			a.setInt(3, bal);
			
			a.executeUpdate();
			System.out.println("Account Created Successfully...");
			
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
