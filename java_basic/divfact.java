package java_day1;
import java.util.Scanner;
import java.math.*;
public class divfact {
   public static void main(String[] args)
   {
	    int n;
	   System.out.println("Enter n value to print this series 1 + x/1! + x^2/2!  + x^3/3! + ....+ x^n/n!: ");
	   Scanner t = new Scanner(System.in);
	   n=t.nextInt();
	   //System.out.println("1 +");
	   for(int i=1;i<=n;i++)
	   {
		   System.out.print("1 + x^"+i+"/"+i+"!");  
		   
		   
	   }
	  // System.out.println("\n"+sum); 
   }
}
