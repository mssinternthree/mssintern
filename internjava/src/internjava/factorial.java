package internjava;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		
      System.out.println("Enter a number to print its factorial");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int fact=1;
      for(int i=n;i>0;i--)
      {
    	  fact=i*fact;
      }
      System.out.println("Factorial of the given number is "+fact);
	}

}
