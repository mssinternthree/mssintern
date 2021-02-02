package java_day1;
import java.util.Scanner;
public class origin {
	public static void main(String[] args)
	{
		int x,y;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter a X-axis:");
		System.out.println("Ente a y-axis:");
		x= obj.nextInt();
		y= obj.nextInt();
		if(x==0 && y==0)
		{
		 System.out.println("Yes, co-ordinates lies on origin");
	 }
	 else {
		 System.out.println("Co-ordinates placed somewhere else");
	 }
	}

}
