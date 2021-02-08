package Inheritance;
import java.util.Scanner;
 class ATM extends Exception 
 {
	 ATM()
	 {
		 System.out.println("Amount should not be less than 500");
	 }
	 
	  
}
 class Exceptions1 extends ATM{
	 static void deposite()
	  {
		 int balance=1000;
		  Scanner obj1=new Scanner(System.in);
		  int amount;
		  try{
			  System.out.println("Enter Amount to deposite: ");
		 
		      amount=obj1.nextInt();
		      if(amount<500)
		      {
			  throw new ATM();
		      }
		     }
	    catch(ATM a)
	    {
		  System.out.println(a);
	    }
	  }
        public static void main(String[] args) 
        {
        	int balance=100000,loop=1,n,check,con=1,r;
        	String s1=null,s2=null,s3,s4;
        	Exceptions1 exc=new Exceptions1();
        	Scanner obj =new Scanner(System.in);
        	System.out.println("1. Register 2. Login");
        	r=obj.nextInt();
        	while(con!=0)
        	{
        		System.out.println("1. Register 2. Login");
            	r=obj.nextInt();
        		if(r==1)
            	{
            		System.out.println("Enter your UserName: ");
            		 s1=obj.nextLine();
            		System.out.println("Enter password: ");
            		s2=obj.nextLine();
            	}
            	else if(r==2)
            	{
            		System.out.println("Enter your Registered UserName: ");
            		 s3=obj.nextLine();
            		System.out.println("Enter password: ");
            		 s4=obj.nextLine();
            		if(s1.equals(s3) && s2.equals(s4))
            		{
            			while(loop!=0)
                    	{
                    		System.out.println("CHINNI'S BANK\nMENU\n1.Deposite\n2.Withdrawl\n3.Balance Enquiry");
                    		n=obj.nextInt();
                    		if(n==1)
                    		{
                    			deposite();
                    		}
                    	}
                    	
            		}
            		else
            		{
            			System.out.println("if you want try again then click 1");
            			check=obj.nextInt();
            			if(check==1)
            			{
            				con=1;
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

