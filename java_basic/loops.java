package java_day1;
import java.util.Scanner;
public class loops {
   public static void main(String[] args)
   {
	   int n,sum1=0,sum2=0,sum3=0,i,j=1,k=1;
	   System.out.println("Enter n value: ");
	   Scanner t = new Scanner(System.in);
	   n = t.nextInt();
	   for( i=1;i<=n;i++)
	   {
		   if(i % 2==0)
		   {
			   sum1=sum1+i;
		  
		   }
	   }
	   System.out.printf("Using FOR loop, Sum of even is: "+sum1+"\n");
	   while(j<=n)
	   {
		   if(j % 2==0)
		   {
			   sum2=sum2+j;
		  
		   }
		   j++;
	   }
	   System.out.printf("Using while loop, Sum of even is: "+sum2+"\n");
	   do
	   {
		   if(k % 2==0)
		   {
			   sum3=sum3+k;
		  
		   }
		   k++;
	   }while(k<=n);
	   System.out.printf("Using do while loop, Sum of even is: "+sum3+"\n");
   }
}
