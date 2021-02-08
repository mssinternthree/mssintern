package internjava;
import java.lang.Math;
import java.util.Scanner;
class fractionseries3
{
	public static void main(String args[])
	{   System.out.println("enter n to print series 1 + x/1! + x^2/2! + x^3/3! + .......... + x^n/n!");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter x");
		int x=sc.nextInt();
		float sum=0.f;
		for(int i=0;i<=n;i++)
		{   int fact=1;
			for(int j=1;j<=i;j++)
			{
			 fact=fact*j;
			}
			sum=sum+((float)Math.pow(x, 2)/(float)fact);
		}
		System.out.println(sum);
		
	}
}