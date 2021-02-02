package java_day1;
import java.util.Scanner;
public class marks {
   public static void main(String[] args)
   {
	    int n;
	    Scanner div=new Scanner(System.in);
	    System.out.println("Enter M1 marks:");
	    n=div.nextInt();
	   // n=div.nextInt();
	    if(n>=90)
	    {
	    	System.out.println("You scored A grade in M1");
	    }
	    else if(n>=50 && n<=89)
	    {
	    	System.out.println("You scored B grade in M1");
	    }
	    else if(n>=30 && n<=49){
	    	System.out.println(" You scored C grade in M1");
	    }
	    else {
	    	System.out.println(" You failed in M1");
	    }
	    }
   }

