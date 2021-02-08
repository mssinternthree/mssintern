package jdCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MitC {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
			System.out.println("connection established");
			PreparedStatement ps=con.prepareStatement("insert into mit (name,age) values('Riaz',22)");
			int isupdate=ps.executeUpdate();
			if(isupdate==1)
			System.out.println("de");
			else
				System.out.println("not done");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
