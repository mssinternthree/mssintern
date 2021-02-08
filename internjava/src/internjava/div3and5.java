package internjava;
import java.util.Scanner;
public class div3and5 {
	public static void main(String args[])
	{
		System.out.println("enter a number to check wheather it is divisible by 3 and 5");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%3==0 && n%5==0)
		{
		System.out.println(n+" is divisible by both 3 and 5");	
		}
		else
		{
			System.out.println(n+" is not divisible by both 3 and 5");
		}
	}

}
