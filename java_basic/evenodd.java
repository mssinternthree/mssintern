package java_day1;
import java.util.Scanner;
public class evenodd {
public static void main(String[] args)
{
	int n;
	Scanner n1 = new Scanner(System.in);
	n=n1.nextInt();
	if(n%2==0)
	{
		System.out.println(n+"is a Even number");
		
	}
	else {
		System.out.println(n+ "is a odd number");
		
	}
}
}
