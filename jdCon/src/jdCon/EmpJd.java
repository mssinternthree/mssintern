package jdCon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpJd {

	public static void main(String[] args) {
	
	int i=1;
	while(i==1) {
		System.out.print("select the below options \n1)Register New Employee\n2)Fetch employees details");
		Scanner scan = new Scanner(System.in);
		int choice=scan.nextInt();
		if(choice==2) {
			System.out.print("Enter Employee First Name");
			String efname=scan.next().concat("%");
			
			scan.nextLine();
			System.out.print("Enter Employee Last Name");
			String elname=scan.next().concat("%");
			scan.nextLine();
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mss", "root", "root");
				System.out.println("connection successfully established");
				PreparedStatement ps = con.prepareStatement("select firstname,lastname,salary from emptable where firstname like ? and lastname like ? ");
				ps.setString(1,efname);
				ps.setString(2,elname);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println("Employee FirstName:-"+rs.getString(1));
					System.out.println("Employee lastName:-"+rs.getString(2));
					System.out.println("Employee Salary:-"+rs.getInt(3));
				}
				i=0;
			}catch (java.sql.SQLIntegrityConstraintViolationException e) {
				System.out.println("check values");
			}catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}else if(choice==1) {
			System.out.print("Enter Employee First Name");
			String efname=scan.next();
			scan.nextLine();
			System.out.print("Enter Employee Last Name");
			String elname=scan.next();
			scan.nextLine();
			System.out.print("Enter Employee Age");
			int  eage=scan.nextInt();
			scan.nextLine();
			System.out.print("Enter Employee salary");
			int  esal=scan.nextInt();

			try {
				System.out.println("Establishing connection ");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
				PreparedStatement ps=con.prepareStatement("INSERT INTO emptable (firstname, lastname, age, salary) VALUES (?, ?, ?, ?);");
				ps.setString(1,efname);
				ps.setString(2,elname);
				ps.setInt(3,eage);
				ps.setInt(4,esal);
				int isupdate=ps.executeUpdate();
				con.close();
				System.out.println("connection successfull");
				if(isupdate==1) {
					
					System.out.println("Account created successfully");
					System.out.println("Want to see menu again 1)yes2)No");
					
					int  ch=scan.nextInt();
					if(ch==1) {
						i=1;
					}else {
						i=0;
					}
				}
				else
					System.out.println("not done");
			} catch (java.sql.SQLIntegrityConstraintViolationException e) {
				System.out.println("username already exists enter new user name");
			}catch (SQLException e) {
				
				e.printStackTrace();
			}
		}else {
			System.out.print("Invalid Option");
			i=0;
		}
		System.out.print("Thank you");
	}

	}

}
