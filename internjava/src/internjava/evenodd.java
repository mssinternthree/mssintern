package internjava;
import java.util.Scanner;

public class evenodd {
	public static void main(String args[]) {
		System.out.println("enter a number to check wheather it is even or odd");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		
			System.out.println(n+" is a even number");
		
	  else 
		  System.out.println(n+" is a odd number");
	  
		
	}
}
