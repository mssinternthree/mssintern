package divisiblebythreeandfive;

import java.util.Scanner;

public class leapyear {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter any year: ");
			int year = scan.nextInt();
			boolean leap = false;

		    // if the year is divided by 4
		    if (year % 4 == 0) {

		      // if the year is century
		      if (year % 100 == 0) {

		        // if year is divided by 400
		        // then it is a leap year
		        if (year % 400 == 0)
		          leap = true;
		        else
		          leap = false;
		      }
		      
		      // if the year is not century
		      else
		        leap = true;
		    }
		    
		    else
		      leap = false;

		    if (leap)
		      System.out.println(year + " is a leap year.");
		    else
		      System.out.println(year + " is not a leap year.");
		  }
	}


