package internjava;
import java.util.Scanner;
class seriesfraction
{
	public static void main(String args[])
	{   System.out.println("enter n to print sum of 1/1 + 1/2 + 1/3 + ...... + 1/n.");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float sum=0.0f;
		for(int i=1;i<=n;i++)
		{
		    sum=sum+(1.0f/(float)i);
		}
		System.out.println(sum);
	}
}
