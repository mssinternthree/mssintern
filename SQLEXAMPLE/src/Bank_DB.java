import java.sql.Connection;
import org.apache.log4j.Logger;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class UserException extends Exception{
	UserException(String err){
		System.out.println(err);
	}
}
public class Bank_DB {
	int amount;
	static Logger log = Logger.getLogger(Bank_DB.class.getName());
	
	Bank_DB(){
		amount=10000;
	}
	
	public void trasaction(int accid,Connection con) throws Exception{
		char ch='y';
		int tranchoice;
		int amount;
		Scanner sc=new Scanner(System.in);
		
		loop:
		while(ch=='y'||ch=='Y') {
			PreparedStatement ps=con.prepareStatement("select * from bankaccounts  where accountid=?");
			 ps.setInt(1, accid);
			 ResultSet rs=ps.executeQuery();
			 int dbbal=0;
			 while(rs.next()) {
				 dbbal=rs.getInt(4);
			 }
			System.out.println("Enter your choice - \n1.Withdraw\n2.Deposit\n3.Show Balance\n4.Transfer\n5.Exit");
			tranchoice=sc.nextInt();
			
			switch(tranchoice) {
				case 1:System.out.println("Enter amount to Withdraw");
						amount=sc.nextInt();
						
						try {
							if(amount>dbbal) {
								throw new UserException("Amount insufficient !!!");
							}else {
								ps=con.prepareStatement("UPDATE bankaccounts set balance=? where accountid=?");
								ps.setInt(1, (dbbal-amount));
								ps.setInt(2, accid);
								ps.executeUpdate();
								System.out.println("Current Balance : "+(dbbal-amount));
								log.info("Account Id : "+accid+" Withdrew money from the bank, total balance is : "+(dbbal-amount));
							}
							
						}catch(Exception e) {
							continue loop;
						}
						break;
				case 2:System.out.println("Enter amount to Deposit");
						amount=sc.nextInt();	
						try {
							if(amount<500) {
								throw new UserException("Pakkaki velli aduko");
							}else {
								ps=con.prepareStatement("UPDATE bankaccounts set balance=? where accountid=?");
								ps.setInt(1, (dbbal+amount));
								ps.setInt(2, accid);
								ps.executeUpdate();
								System.out.println("Current Balance : "+(dbbal+amount));
								log.info("Account Id : "+accid+" Deposited money to his bank, total balance is : "+(dbbal+amount));
							}
						}catch(Exception e) {
							continue loop;
						}
						break;
				case 3:System.out.println("Total balance : "+dbbal);
						log.info("Account Id : "+accid+" Balance enquiry done, total balance is : "+dbbal);
						break;
						
				case 4:System.out.println("Enter Third party Account id : ");
				 		int thirdaccid=sc.nextInt();
				 		 ps=con.prepareStatement("select * from bankaccounts  where accountid=?");
						 ps.setInt(1, accid);
						 rs=ps.executeQuery();
						 int thirddbbal=0;
						 while(rs.next()) {
							 thirddbbal=rs.getInt(4);
						 }
						 
						 System.out.println("Enter amount to transfer : ");
						 amount=sc.nextInt();
						 
						 if(amount<dbbal) {
							 throw new UserException("Amount insufficient !!!");
						 }else {
							ps=con.prepareStatement("UPDATE bankaccounts set balance=? where accountid=?");
							ps.setInt(1, (thirddbbal+amount));
							ps.setInt(2, thirdaccid);
							ps.executeUpdate();
							
							ps=con.prepareStatement("UPDATE bankaccounts set balance=? where accountid=?");
							ps.setInt(1, (dbbal-amount));
							ps.setInt(2, accid);
							ps.executeUpdate();
							
							System.out.println("Transfer Complete, Current Balance : "+(dbbal-amount));
							log.info("Account Id : "+accid+" trasfered money to account id "+thirdaccid+" , total balance is : "+(dbbal-amount));
						 }
						
				case 5:	log.info("Account Id : "+accid+" logged off.");
						System.out.println("Trasaction Complete");
						System.exit(0);
				
				default:System.out.println("Invalid Balance !!! ");
 			}
			System.out.println("Want to do any more trasactions : ");
			ch=sc.next().charAt(0);
		}
	}

	 public static void  main(String...args) throws Exception{
		 Class.forName("com.mysql.jdbc.Driver");
		 Bank_DB obj=new Bank_DB();
		 Connection con=null;
		 Scanner  sc=new Scanner(System.in);
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankproject","root","ashu23456");
		 System.out.println("Connection Established!");
		 
		 System.out.println("Enter your Account id : ");
		 int accid=sc.nextInt();
		 PreparedStatement ps=con.prepareStatement("select * from bankaccounts  where accountid=?");
		 ps.setInt(1, accid);
		 ResultSet rs=ps.executeQuery();
		 String dbuid=null,dbpass=null;
		 int dbbal=0;
		 while(rs.next()) {
			 dbuid=rs.getString(2);
			 dbpass=rs.getString(3);
			 dbbal=rs.getInt(4);
		 }
		 
		 System.out.println("Enter Username : ");
		 String uid=sc.next();
		 sc.nextLine();
		 System.out.println("Enter Password : ");
		 String pass=sc.nextLine();
		 
		 try {
			 if(uid.compareTo(dbuid)!=0 && pass.compareTo(dbpass)!=0) {
				 	log.warn("Failed to login to account id : "+accid);
					throw new UserException("Wrong Username or password try again");
			}else {
				log.info("Account Id : "+accid+" logged in.");
				obj.trasaction(accid,con);
			}
		 }catch(Exception onee) {
			 try {
				 System.out.println("Enter Username : ");
				 uid=sc.nextLine();
				 System.out.println("Enter Password : ");
				 pass=sc.nextLine();
				 if(uid.compareTo(dbuid)!=0 && pass.compareTo(dbpass)!=0) {
					 	log.warn("Failed to login to account id : "+accid);
						throw new UserException("Wrong Username or password try again");
				}else {
					log.info("Account Id : "+accid+" logged in.");
					obj.trasaction(accid,con);
				}
			 }catch(Exception twoe) {
				 try {
					 System.out.println("Enter Username : ");
					 uid=sc.nextLine();
					 System.out.println("Enter Password : ");
					 pass=sc.nextLine();
					 if(uid.compareTo(dbuid)!=0 && pass.compareTo(dbpass)!=0) {
						 	log.warn("Failed to login to account id : "+accid);
							throw new UserException("Wrong Username or password try again");
					}else {
						log.info("Account Id : "+accid+" logged in.");
						obj.trasaction(accid,con);
					}
				 }catch(Exception threee) {
					 System.out.println("Please Try again after some time.");
				 }
			 }
		 }finally {
			 log.info("Account Id : "+accid+" logged off.");
			 System.out.println("Trasaction Complete");
		 }
	 }
}
