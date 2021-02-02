package mssintern;

import java.util.Scanner;

public class passorfail {
	public static void main(String[] args)
	{
		int passfail;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your marks:");
		passfail=scan.nextInt();
		if((passfail>35)) {
			System.out.println("congo!!!!!you are passed");
			
	        System.out.println("The student Grade is: ");
	        if(passfail>=80)
	        {
	            System.out.print("A");
	        }
	        else if(passfail>=60 && passfail<80)
	        {
	           System.out.print("B");
	        } 
	        else if(passfail>=40 && passfail<60)
	        {
	            System.out.print("C");
	        }
	        else
	        {
	            System.out.print("D");
	        }
		}
		else
		{
			System.out.println("prepare well for the supply");
		}
	} 
}
