package java_day1;
import java.util.Scanner;
public class evenno {
   public static void main(String[] args)
   {
	   int n;
	   System.out.printf("Enter n value:/\");
	   System.out.printf("Enter n value: ");
	   Scanner t = new Scanner(System.in);
	   n = t.nextInt();
	   for(int i=1;i<=n;i++)
	   {
		   if(i % 2==0)
		   {
		   System.out.printf(i+"\n");
		   }
	   }
   }
}
