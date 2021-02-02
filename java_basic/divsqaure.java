package java_day1;
import java.util.Scanner;
import java.math.*;
public class divsqaure {
   public static void main(String[] args)
   {
	    float sum=1.0f,n;
	   System.out.println("Enter n value: ");
	   Scanner t = new Scanner(System.in);
	   n=t.nextFloat();
	   for(int j=0;j<=n;j++) {
		   System.out.printf("1/2^"+j+"\t");
		   }
	   for(float i=1;i<=n;i++)
	   {
		   
		   sum+=(1/Math.pow(2,i));
		   
	   }
	   System.out.println("\n"+sum);   
   }
}
