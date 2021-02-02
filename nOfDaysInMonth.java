import java.util.Scanner;
public class nOfDaysInMonth {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter a");
		String month=scan.nextLine();
		switch(month) {
		  case "january":
			  System.out.println("31");
		    break;
		  case "february":
			  System.out.println("28 or 29");
		    break;
		  case "march":
			  System.out.println("31");
			    break;
		  case "april":		 
			  System.out.println("30");
			    break;
		  case "may":		 
			  System.out.println("31");
			    break;
		  case "june":		 
			  System.out.println("30");
			    break;
		  case "july":		 
			  System.out.println("31");
			    break;
		  case "august":		 
			  System.out.println("31");
			    break;
		  case "september":		 
			  System.out.println("30");
			    break;
		  case "october":		 
			  System.out.println("31");
			    break;
		  case "november":		 
			  System.out.println("30");
			    break;
		  case "december":		 
			  System.out.println("31");
			    break;
		  default:
			  System.out.println("wrong option");
		}

	}

}
