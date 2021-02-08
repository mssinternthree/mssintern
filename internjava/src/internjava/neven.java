package internjava;
import java.util.Scanner;
public class neven {
		public static void main(String args[])
		{   System.out.println("enter a number");
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int no=1;
			for(int i=1;no<=n;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				    no++;
			}
			}

		}

	}