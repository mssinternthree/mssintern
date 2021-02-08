package jdCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class createBankACC {

	public static void main(String[] args) {
		int loop=1;
		while(loop==1) {
			Scanner scan = new Scanner(System.in);
			System.out.println("WELCOME TO BANK OF BHOGPUR");
			System.out.println("++++++++++++++++++++++++++");
			System.out.println("Creating Bank Account");
			System.out.println("Enter username");
			String uname= scan.next();
			scan.nextLine();
			System.out.println("\tEnter password");
			String pass= scan.next();
			scan.nextLine();
			System.out.println("Initial balance");
			int bal= scan.nextInt();
			System.out.println("\tconnecting with database .....");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
				
				PreparedStatement ps=con.prepareStatement("insert into bank (username,password,balance) values(?,?,?)");
				ps.setString(1,uname);
				ps.setInt(3,bal);
				ps.setString(2,pass);
				int isupdate=ps.executeUpdate();
				con.close();
				System.out.println("connection successfull");
				if(isupdate==1) {
					
					System.out.println("Account created successfully");
					loop=0;
				}
				else
					System.out.println("not done");
			} catch (java.sql.SQLIntegrityConstraintViolationException e) {
				System.out.println("username already exists enter new user name");
			}catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
