package internjava;
import java.util.Scanner;
public class big3ternary {
	public static void main(String args[])
	  {
		  System.out.println("Enter 3 numbers");
		  Scanner sc=new Scanner(System.in);
		  int x=sc.nextInt();
		  int y=sc.nextInt();
		  int z=sc.nextInt();
		  int r= (x > y) ? (x > z ? x : z) : (y > z ? y : z);  ;
		  System.out.println(r+" is biggest number ");
		  
	  }
	}

