package Inheritance;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.lang.*;
class ATM extends Exception 
 {
	public ATM()
	 {
		 System.out.println("Exception Raised");
	 }
	 
	  
}
 public class Bank {
	 static void deposite(int total)throws ATM
	  {
		 int balance=1000,amount=0;
		  Scanner obj1=new Scanner(System.in);
		  System.out.println("Enter Amount to deposite: ");
		   
	      amount=obj1.nextInt();
		  
		  try{
			  
		      if(amount<500)
		      {
			  throw new ATM();
		      }
		      else {
				  
			      System.out.println("Deposited: "+amount);
			      total=total+amount;
				  System.out.println("Your Total Balance is "+total);
				}
		      
		     }
		 
	    catch(ATM a)
	    {
		  System.out.println(a);
	    }
		
	  }
		  static void withdrawl(int total)throws ATM
		  {
			 int withd=0;
			  Scanner obj2=new Scanner(System.in);
			  System.out.println("Enter Amount to withdrawl: ");
		      withd=obj2.nextInt();
			  
			  try{
				  
			      if(withd>total)
			      {
				  throw new ATM();
			      }
			      else {
			    	  System.out.println("Withdrawl Receipt: "+withd);
				      total=total-withd;
					  System.out.println("Your Total Balance is "+total);
			      }
			     }
		    catch(ATM a)
		    {
			  System.out.println(a);
		    }
	  }
		  static void BalanceEnquiry(int total)
		  {
			  System.out.println("Your Balance is "+total);
		  }
        public static void main(String[] args) 
        {
        	int loop=1,n,check,i=0,con=1,r,total=10000;
        	String s1=null,s2=null,s3,s4;
        	Bank exc=new Bank();
        	Scanner obj =new Scanner(System.in);
        
        		while(con!=0 && i<3)
            	{
            		System.out.println("1. Register 2. Login");
                 	r=obj.nextInt();	
            		if(r==1)
                	{ 
                		 System.out.println("Enter your UserName: ");
                		 s1=obj.next();
                		 System.out.println("Enter password: ");
                		 s2=obj.next();
                	}
                	else if(r==2)
                	{
                		 System.out.println("Enter your Registered UserName: ");
                		 s3=obj.next();
                		 System.out.println("Enter password: ");
                		 s4=obj.next();
                	   	if(s1.equals(s3) && s2.equals(s4))
                		{
                			while(loop!=0)
                        	{
                        		System.out.println("CHINNI'S BANK\nMENU\n1.Deposite\n2.Withdrawl\n3.Balance Enquiry\n4.Exit");
                        		n=obj.nextInt();
                        		if(n==1)
                        		{
                        		    try{
                        		    deposite(total);
                        		  	  
                        		    }
                        		    catch (ATM e){
                        		        System.out.println(e);
                        		    }
                        		}
                        		    else if(n==2)
                        		    {
                        		    	try {
                        		    		withdrawl(total);
                        		    		
                        		    	    }
                        		    	catch (ATM e){
                            		        System.out.println(e);
                            		                 }
                        		    
                        		            }
                        		    else if(n==3)
                        		    {
                        		       BalanceEnquiry(total);
                        		    }
                        		    else if(n==4)
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
                			i++;
                			if(i>=3)
            				{
            					System.out.println("Try after sometime .....!");
            					
            				}
                			
                		System.out.println("Wrong Credentials\nif you want try again then click 1");
              			check=obj.nextInt();
                			
                			if(check==1)
                			{
                				con=1;
                				
                				//System.out.println(i);
                				
                			}
                			else
                			{
                				con=0;
                			}
                			}
                		
                	}
            	}
            	
        
            }
        	}

