import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to find Leap year or not");
		year = in.nextInt();
	    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
	        System.out.println(year + " "+"LEAP YEAR");  
	    }  
	    else{  
	        System.out.println(year + " "+ "Not a Leap Year");  
	    }  

	}

}
