package internjava;
import java.util.Scanner;
public class evensum {
		public static void main(String args[])
		{   System.out.println("enter a number");
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int sum=0;
			for(int i=1;i<n;i++)
			{
				if(i%2==0)
					sum=sum+i;
			}
			System.out.println(sum);
		}

	}

