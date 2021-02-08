package internjava;
import java.util.Scanner;
public class evenloops {
		public static void main(String args[])
		{   System.out.println("enter a number");
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    System.out.println(" using for");
			for(int i=1;i<n;i++)
			{
				if(i%2==0)
					System.out.println(i);
			}
		    int i=1;
		    System.out.println(" using while");
		    while(i<=n)
		    {
		    	if(i%2==0)
		    	{
					System.out.println(i);
		    	}
		    	i++;
		    }
		    System.out.println(" using do while");
		    i=1;
		    do
		    {
		    	if(i%2==0)
		    	{
					System.out.println(i);
		    	    
		    	}
		    	i++;
		    }while(i<=n);
			
		}

	}
