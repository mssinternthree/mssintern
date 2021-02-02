package mssintern;

import java.util.Scanner;

public class leapornot {
	public static void main(String[] args) {
		
		int year;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a year:");
		year=scan.nextInt();
if(year%400==0) {
	System.out.println(year+" it is a leap year");
	
}else

{
	System.out.println(year+"it is not a leap year");
	}
}
}
