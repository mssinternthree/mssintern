package java_day1;
import java.util.Scanner;
public class leap {
	public static void main(String[] args)
	{
		int year;
		Scanner year1= new Scanner(System.in);
		year= year1.nextInt();
	 if(((year%400==0) || (year%4==0)) &&(year%100!=0))
	 {
		 System.out.println("It is a leap year");
	 }
	 else {
		 System.out.println("It is not a leap year");
	 }
	}

}
