package mysql.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Bank_Account {
   public static void main(String[] args) throws java.sql.SQLIntegrityConstraintViolationException
   {
	   int i=1;
	  String s1,s3,s4 = null;
	  String s2 = null;
	   Scanner obj=new Scanner(System.in);
	   System.out.println("WELCOME TO CHINNI'S BANK");
	   System.out.println("------Create Your Bank Account------");
	   System.out.println("Enter UserName: ");
		 s1=obj.next();
		 while(i!=0)
		 {
		 System.out.println("Enter Password: ");
		 s2=obj.next();
		 System.out.println("Re-Enter Password: ");
		 s3=obj.next();

		 if(s2.equals(s3))
		 {
			 System.out.println("Register Successfull");
			 System.out.println("Enter your 8 digit Account number: ");
			  s4=obj.next();
		     i=0;
		     System.out.println("Welcome to Chinni's Bank");
		 }
		 else
			  System.out.println("Password shouldn't match\n Try Again\n");
		 }
         try {
        	 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
        	 PreparedStatement ps1 = con.prepareStatement("insert into chinnis_bank (User_Name,Password,Account_No,Balance) values (?,?,?,10000)");
        	 
        	 ps1.setString(1,s1);
        	 ps1.setString(2,s2);
        	 ps1.setString(3,s4);
        	 int result = ps1.executeUpdate();
        	 
        	 System.out.println(result);
        	 if(result ==1)
        	 {
        		 System.out.println("Account Created Successfully");
        	 }
        	 else {
        		  System.out.println("Execution Exception"); 
        	    }
        	 con.close();
         }catch(SQLException e)
         {
        	 System.out.println(e);
         }
		 }
		 
   }

