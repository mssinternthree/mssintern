package internjava;
import java.lang.Math;
import java.util.Scanner;
class sumfraction2
{
	public static void main(String args[])
	{   System.out.println("enter n to print sum of 1/1 + 1/2^1 + 1/2^2 + ...... + 1/2^n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float sum=0.0f;
		for(int i=0;i<=n;i++)
		{
		    sum=sum+(1.0f/(float)Math.pow(2,i));
		}
		System.out.println(sum);
	}
}