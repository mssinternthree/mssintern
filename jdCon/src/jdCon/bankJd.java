package jdCon;

import java.util.Scanner;

import java.sql.*;

class MyException extends Exception 
{ 
	public MyException(String s) 
	{ 
		super(s); 
	} 
}
public class bankJd {
	public static void main(String args[]) throws SQLException 
	{ 
		
		int i=0;
		int t=1;
		int ls=1;
		String uname="";
		String pass="";
		Scanner scan = new Scanner(System.in);
while(i<3 && t==1) {
	
	if(ls==1) {
		System.out.println(" Enter username");
		uname= scan.next();
		scan.nextLine();
		System.out.println(" Enter password");
		 pass= scan.next();
		scan.nextLine();
	}
	
	String cname="";
	String cpass="";
	int cbalance=0;
	System.out.println("\tconnecting to database");
	try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
		System.out.println("connection successfully established");
		PreparedStatement ps=con.prepareStatement("select username,password,balance from bank where username=?");
		ps.setString(1,uname);
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			cname=rs.getString(1);
			cpass=rs.getString(2);
			cbalance=rs.getInt(3);
			
		}
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	 int check_usr=uname.compareTo(cname);
	 int check_pass =pass.compareTo(cpass);

	 try {
		 if(check_usr==0&&check_pass==0) {
			    ls=0;
				System.out.printf("select option\n1:withdraw\n2:deposit\n3:balance\n4Transfer\n5:exit");
				int op=scan.nextInt();
				if(op ==1) {
					System.out.printf("Enter amount you want to withdraw");
					int with=scan.nextInt();
					if(with>cbalance) {
						i+=1;
						throw new MyException("***Insufficient balance***");
						
					}else {
//						System.out.println("success");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
						PreparedStatement ps=con.prepareStatement("UPDATE bank SET  balance = ? WHERE (username = ?)");
						cbalance=cbalance-with;
						ps.setInt(1,cbalance);
						ps.setString(2,uname);
						int rs= ps.executeUpdate();
						con.close();
						if(rs==1) {
							System.out.println("******Successfully Withdrawn******");
							System.out.println("want to see menu\n1:yes\n2:no");
							int m=scan.nextInt();
							if(m==1) {
								t=1;
							}else if(m==2) {
								t=0;
							}else {
								i+=1;
								throw new MyException("\tPlease enter a invalid option");
							}
						}else {
							System.out.println("SERVER ERROR");
						}
						
					}
				}else if(op==2) {
					System.out.println("Enter amount you want to deposit");
					int depo=scan.nextInt();
					if(depo<500) {
						i+=1;
						throw new MyException("****Insert amount more than 500****");
					}else {
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
						PreparedStatement ps=con.prepareStatement("UPDATE bank SET  balance = ? WHERE (username = ?)");
						cbalance=cbalance+depo;
						ps.setInt(1,cbalance);
						ps.setString(2,uname);
						int rs= ps.executeUpdate();
						con.close();
						if(rs==1) {
							System.out.println("Balance Updated Succesfully");
							
							System.out.print("want to see menu\n1:yes\n2:no");
							int m=scan.nextInt();
							if(m==1) {
								t=1;
							}else if(m==2) {
								t=0;
							}else {
								i+=1;
								throw new MyException("invalid option");
							}
						}else {
							System.out.printf("SERVER ERROR");
						}
						
					}
				}else if(op==3) {
					t=0;
					System.out.println(cbalance);
					System.out.printf("Want to see menu\n1:yes\n2:no");
					int m=scan.nextInt();
					if(m==1) {
						t=1;
					}else if(m==2) {
						t=0;
					}else {
						i+=1;
						throw new MyException("Invalid option");
					}
				}else if(op==4) {
					t=0;
					
					System.out.printf("Enter amount you want to transfer");
					int m=scan.nextInt();
					scan.nextLine();
					int tuserbal=0;
					System.out.printf("Enter user name to transfer");
					String Tuser=scan.nextLine();
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
					System.out.println("connection successfully established");
					if(cbalance>m) {
						PreparedStatement ps=con.prepareStatement("UPDATE bank SET  balance = ? WHERE (username = ?)");
						ps.setInt(1,cbalance-m);
						ps.setString(2,uname);
						int rs3= ps.executeUpdate();
						System.out.println("Transfer Successfull");
					}
							Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
							System.out.println("connection successfully established");
							PreparedStatement ps1=con1.prepareStatement("select balance from bank where username=?");
							ps1.setString(1,Tuser);
							ResultSet rs1= ps1.executeQuery();
							while(rs1.next()) {
								 tuserbal=rs1.getInt(1);
							}
							PreparedStatement ps2=con.prepareStatement("UPDATE bank SET  balance = ? WHERE (username = ?)");
							ps2.setInt(1,tuserbal+m);
							ps2.setString(2,Tuser);
							int rs2= ps2.executeUpdate();
							con1.close();
							System.out.println("Want to see menu 1.yes 2.No");
							int op1=scan.nextInt();
							
					if(op1==1) {
						t=1;
					}else if(op1==2) {
						t=0;
					}else {
						i+=1;
						throw new MyException("Invalid option");
					}
				}else if(op==5) {
					break;
				}else{
					i+=1;
					throw new MyException("Invalid option");
					
				}
				}
			else {
				i+=1;
				ls=1;
				throw new MyException("Invalid credintials");
			}
	 }catch(MyException e) {
		 System.out.println(e.getMessage());
	 }catch(SQLException e) {
		 System.out.println(e.getMessage());
	 }
		
	}
		

	
	} 

}
