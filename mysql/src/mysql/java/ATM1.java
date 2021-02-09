package mysql.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



class bank extends Exception
{
	public bank()
	 {
		 System.out.println("Exception Raised");
	 }
}





public class ATM1 {
	
	static void deposite(int balance1, String U_name)throws bank, SQLException
	  {
		
		 int amount=0;
		  Scanner obj1=new Scanner(System.in);
		  System.out.println("Enter Amount to deposite: ");
		 amount=obj1.nextInt();
		  
		  try{
			  
		      if(amount<500)
		      {
			  throw new bank();
		      }
		      else {
				  
			      System.out.println("Deposited: "+amount);
			       balance1=balance1+amount;
				  System.out.println("Your Total Balance is "+balance1);
				}
		      Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
				PreparedStatement ps1 = con1.prepareStatement("update chinnis_bank set Balance =? where User_Name=?");
				ps1.setInt(1,balance1);
				ps1.setString(2, U_name);
				int result = ps1.executeUpdate();
		      
		     }
		 
	    catch(bank a)
	    {
		  System.out.println(a);
	    }

		
	  }	
	
	static void withdrawl(int balance1, String U_name)throws bank, SQLException
	  {
		
		 int withd=0;
		  Scanner obj2=new Scanner(System.in);
		  System.out.println("Enter Amount to withdrawl: ");
	      withd=obj2.nextInt();
		  
		  try{
			  
		      if(withd>balance1)
		      {
		    	  System.out.println("Sorry, Your Balance is low");
			  throw new bank();
			  
		      }
		      else {
		    	  System.out.println("Withdrawl Receipt: "+withd);
			      balance1=balance1-withd;
				  System.out.println("Your Total Balance is "+balance1);
		      }
		      Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
				PreparedStatement ps1 = con1.prepareStatement("update chinnis_bank set Balance =? where User_Name=?");
				ps1.setInt(1,balance1);
				ps1.setString(2, U_name);
				int result = ps1.executeUpdate();
		     }
	    catch(bank a)
	    {
		  System.out.println(a);
	    }

      }
	
	 static void BalanceEnquiry(int balance1, String U_name) throws SQLException
	  {
		 Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
			PreparedStatement ps1 = con1.prepareStatement("update chinnis_bank set Balance =? where User_Name=?");
			ps1.setInt(1,balance1);
			ps1.setString(2, U_name);
			int result = ps1.executeUpdate();
		 System.out.println("Your Balance is "+balance1);
	  }
          public static void main(String[] args) throws SQLException, ClassNotFoundException
          {
          
          int loop=1,loop1=1,n,check,i=0,con=1,r,count=0,balance1=0,balance2 = 0;
      	  String s1=null,s2=null,s3,s4,U_name = null,passcode = null;
      	  bank exc=new bank();
      	  Scanner obj =new Scanner(System.in);
      	while(loop1!=0)
        {
      		
      	  System.out.println("Enter UserName: ");
		  s1=obj.next();
		  System.out.println("Enter Password: ");
		  s2=obj.next();
		  
		//Class.forName("com.mysql.jdbc.Driver");
		  try {
		      	  Connection con1= DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
		      	  PreparedStatement ps= con1.prepareStatement("select User_Name,password,Balance from chinnis_bank where User_Name=?");
		      	  ps.setString(1,s1);
		      	  ResultSet rs = ps.executeQuery();
		      	 while(rs.next())
		          {
		        	   U_name=rs.getString(1);
		               passcode =rs.getString(2);
		               balance1 =rs.getInt(3);
		          }
				  }catch(SQLException e)
				  {
					  e.printStackTrace();
				  }
         
          if(U_name.equals(s1) && passcode.equals(s2))
          {
        	   loop1=0;
              System.out.println("Login Successfull");
              //System.out.println("balance start :"+balance1);
              			while(loop!=0)
                      	{
              				try {
                		      	  Connection con1= DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
                		      	  PreparedStatement ps= con1.prepareStatement("select Balance from chinnis_bank where User_Name=?");
                		      	  ps.setString(1,s1);
                		      	  ResultSet rs = ps.executeQuery();
                		      	 while(rs.next())
                		          {
                		               balance1 =rs.getInt(1);
                		          }
                				  }catch(SQLException e)
                				  {
                					  e.printStackTrace();
                				  }
                      		System.out.println("CHINNI'S BANK\nMENU\n1.Deposite\n2.Withdrawl\n3.Balance Enquiry\n4.Transfer\n5.Exit");
                      		n=obj.nextInt();
                      		if(n==1)
                      		{
                      		    try
                      		     {
                      		       deposite(balance1,U_name);
                      		  	  }
                      		    catch (bank e)
                      		      {
                      		        System.out.println(e);
                      		      }
                      		 }
                      		    else if(n==2)
                      		    {
                      		    	try {
                      		    	    withdrawl(balance1,U_name);
                      		    		
                      		    	    }
                      		    	catch (bank e)
                      		    	    {
                          		        System.out.println(e);
                          		         }
                      		    
                      		     }
                      		    else if(n==3)
                      		    {
                      		       BalanceEnquiry(balance1,U_name);
                      		    }
                      		    else if(n==4)
                      		    {
                      				 int tran=0;
                      				 String rname;
                      				  Scanner obj2=new Scanner(System.in);
                      				  System.out.println("Enter Receiver's Bank Name: ");
                      			      rname=obj2.next();
                      			      System.out.println("Enter amount to transfer: ");
                      			      tran=obj2.nextInt();
                      				  if(tran<=balance1)
									  {
										try {  
										Connection con1= DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
									  PreparedStatement ps= con1.prepareStatement("select Balance from chinnis_bank where User_Name=?");
									  ps.setString(1,rname);
									  ResultSet rs = ps.executeQuery();
									 while(rs.next())
									  {
									       balance2 =rs.getInt(1);
									  }
									  balance2=balance2+tran;
									  balance1=balance1-tran;
									  PreparedStatement ps1 = con1.prepareStatement("update chinnis_bank set Balance =? where User_Name=?");
									  ps1.setInt(1,balance2);
									  ps1.setString(2,rname );
									  int res=ps1.executeUpdate();
									  if(res>0)
									  {
										  System.out.println("Transfer Initiated");
									  }
									  else
									  {
										  System.out.println("Transfer Failed due to technical issue");
									  }
									  PreparedStatement ps2= con1.prepareStatement("update chinnis_bank set Balance=? where User_Name=?");
									  ps2.setInt(1,balance1);
									  ps2.setString(2,U_name);
									  int res1=ps2.executeUpdate();
									  if(res>0)
									  {
										  System.out.println("Transfer successfully Done");
									  }
									  else
									  {
										  System.out.println("Transfer Failed due to technical issue");
									  }
									 
									  }catch(SQLException e)
									  {
										  e.printStackTrace();
									  }
									  
									  }
									  else {
										  System.out.println("Your balance is not sufficient to Transfer"+tran+" funds");
									  }

                      		      
                      			
                      		    }
                      		    else if(n==5)
                      		    {
                      		        System.exit(0);
                      		    }
                      		    else {
                      		    	System.out.println("Invalid Input");
                      		    }
                      	}
                  }
          else
          {
        	  System.out.println("Credentials Missmatch");
        	  System.out.println("Try Again ");
        	  count++;
          }
      		}
      		
          }
              			
           }

