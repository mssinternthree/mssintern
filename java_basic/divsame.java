package java_day1;
import java.util.Scanner;
public class divsame {
   public static void main(String[] args)
   {
	    float sum=0.0f,n;
	   System.out.println("Enter n value: ");
	   Scanner t = new Scanner(System.in);
	   n=t.nextFloat();
	   for(float i=1;i<=n;i++)
	   {
		   System.out.printf("1/"+i+"\t");
		  
		   sum=sum+1/i;
		   
	   }
	   System.out.println("\n"+sum);   
   }
}
