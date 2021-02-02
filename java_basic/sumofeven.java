package java_day1;
import java.util.Scanner;
public class sumofeven {
   public static void main(String[] args)
   {
	   int n,sum=0;
	   System.out.println("Enter n value: ");
	   Scanner t = new Scanner(System.in);
	   n = t.nextInt();
	   for(int i=1;i<=n;i++)
	   {
		   if(i % 2==0)
		   {
			   sum=sum+i;
		  
		   }
	   }
	   System.out.printf(sum+"\n");
   }
}
