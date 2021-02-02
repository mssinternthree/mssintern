package mssintern;

import java.util.Scanner;

public class daysinamonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 System.out.println("enter month");
		 String month=scan.nextLine();
		 switch (month) 
		 {
		 case "january":
		 	System.out.println("31 days");
		 break;
		 
		 case "february":
		 	System.out.println("28days and a leap year have29 days");
		 break;
		 
		 
		 case "march":
			 	System.out.println("31 days");
			 break;
			 
		 case "april":
			 	System.out.println("30 days");
			 break;
			 
		 case "may":
			 	System.out.println("31 days");
			 break;
			 
		 case "june":
			 	System.out.println("30 days");
			 break;
			 
			 
		 case "july":
			 	System.out.println("31 days");
			 break;
			 
		 case "august":
			 	System.out.println("31 days");
			 break;
			 
			 
		 case "september":
			 	System.out.println("30 days");
			 break;
			 	 
		 case "october":
			 	System.out.println("31 days");
			 break;
			 
		 case "november":
			 	System.out.println("30 days");
			 break;
			 
		 case "december":
			 	System.out.println("31 days");
			 break;
		 }
		 

	}

}
