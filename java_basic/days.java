package java_day1;
import java.util.Scanner;
public class days {
	public static void main(String[] args)
	{
   int n;
  Scanner n1= new Scanner(System.in);
  System.out.println("Enter any month as number:" ); 
   n=n1.nextInt();
   if(n==1 || n==3 || n==5 ||n==7 ||n==8 ||n==10||n==12)
   {
	   System.out.println("This month contains 31 days" );
   }
   else if(n==2 || n==4 || n==6 ||n==9 ||n==11 ) {
	   System.out.println("This month contains 30 days " );
   }
   else {
	   System.out.println("Enter between 1 - 12 " );   
   }
   
}
}
