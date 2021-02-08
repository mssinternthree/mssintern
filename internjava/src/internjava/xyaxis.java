package internjava;
import java.util.Scanner;
public class xyaxis {
	public static void main(String args[]) {
		System.out.println("enter X and Y axis co-ordinates");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x==0 && y!=0)
			System.out.println("The co-ordinates lies on Y-axis");
		else if(x!=0 && y==0)
	         System.out.println("The co-ordinates lies on X-axis");
	
		else if(x>0 && y>0)
			System.out.println("The co-ordinates lies in first qudrant");
		else if(x<0 && y>0)
			System.out.println("The co-ordinates lies in second qudrant");
		else if(x<0 && y<0)
			System.out.println("The co-ordinates lies in third qudrant");
		else if(x>0 && y<0)
			System.out.println("The co-ordinates lies in fourth qudrant");
		else
				System.out.println("The co-ordinates lies on origin");
}
}