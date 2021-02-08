package internjava;
import java.util.Scanner;
public class ternaryoperator {
  public static void main(String args[])
  {
	  System.out.println("Enter two numbers");
	  Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  int r=(a>b)?a:b;
	  System.out.println(r+" is biggest number ");
	  
  }
}
