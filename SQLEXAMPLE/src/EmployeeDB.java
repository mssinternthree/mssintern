import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class EmployeeDB {
	
	static Logger log = Logger.getLogger(Bank_DB.class.getName());
	
	public static void main(String...args) throws Exception{
		Scanner in=new Scanner(System.in);
		char ch='y';
		int choice;
		Connection con=null;
		PreparedStatement ps=null;
		
		int empid;
		String empFname;
		String empLname;
		int age;
		int sal;
		
		String name;
		
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankproject","root","ashu23456");
		System.out.println("Connection Established!");
		
		while(ch=='y'||ch=='Y') {
			System.out.println("What do you want to do :\n1. Insert\n2. Delete\n3. Update\n4. Search\n5. Quit");
			choice=in.nextInt();
			
			switch(choice) {
				case 1: System.out.println("Enter Emp Id, first Name, last Name, age and salary : ");
						empid=in.nextInt();
						empFname=in.next();
						in.nextLine();
						empLname=in.next();
						age=in.nextInt();
						sal=in.nextInt();
						in.nextLine();
						
						ps=con.prepareStatement("insert into emptable values(?,?,?,?,?)");
						ps.setInt(1, empid);
						ps.setString(2,empFname);
						ps.setString(3,empLname);
						ps.setInt(4,age);
						ps.setInt(5,sal);
						
						ps.executeUpdate();
						
						log.info("Employee added with id "+empid);
						System.out.println("Employee inserted.");
						break;
						
				case 2:System.out.println("Enter Emp Id to delete : ");
						empid=in.nextInt();
						in.nextLine();
						
						ps=con.prepareStatement("delete from emptable where eid=?");
						ps.setInt(1,empid);
						
						ps.executeUpdate();
						
						log.info("Employee deleted with id "+empid);
						System.out.println("Employee deleted.");
				
						break;
						
				case 3: System.out.println("Enter Emp Id to Update : ");
						empid=in.nextInt();
						System.out.println("What do you want to update :\n1. First Name\n2. Last Name\n3. Salary");
						choice=in.nextInt();
						in.nextLine();
						
						switch(choice) {
							case 1:	System.out.println("Enter First name to Update : ");
									name=in.next();
									in.nextLine();
									
									ps=con.prepareStatement("UPDATE emptable set efname=? where eid=?");
									ps.setString(1, name);
									ps.setInt(2, empid);
									ps.executeUpdate();
									
									System.out.println("Employee details updated.");
									break;
									
							case 2:	System.out.println("Enter Last name to Update : ");
									name=in.next();
									in.nextLine();
									
									ps=con.prepareStatement("UPDATE emptable set elname=? where eid=?");
									ps.setString(1, name);
									ps.setInt(2, empid);
									ps.executeUpdate();
									
									System.out.println("Employee details updated.");
									break;
									
							case 3:	System.out.println("Enter Salary to Update : ");
									sal=in.nextInt();
									in.nextLine();
									
									ps=con.prepareStatement("UPDATE emptable set esal=? where eid=?");
									ps.setInt(1, sal);
									ps.setInt(2, empid);
									ps.executeUpdate();
									
									System.out.println("Employee details updated.");
									break;
							default : System.out.println("Invalid option !");
						}
						log.info("Employee updated with id "+empid);
						break;
				
				case 4:	System.out.println("Enter First name to Update : ");
						empFname=in.next().concat("%");
						
						System.out.println("Enter Last name to Update : ");
						empLname=in.next().concat("%");
						in.nextLine();

						ps=con.prepareStatement("select * from emptable where efname like ? and elname like ?");
						ps.setString(1, empFname);
						ps.setString(2, empLname);
						ResultSet rs=ps.executeQuery();
						
						while(rs.next()) {
							log.info("Employee details found with id "+rs.getInt(1));
							System.out.println("The Employee details are : "+rs.getInt(1)+" , "+rs.getString(2)+" , "+rs.getString(3)+" , "+rs.getInt(4)+" , "+rs.getInt(5));
						}
						 
						break;
						
				case 5: System.exit(0);
				
				default:System.out.println("Wrong choice opted!!");	
			}
			
			System.out.println("Do you want to do any more transactions : ");
			ch=in.nextLine().charAt(0);
		}
	}
}
