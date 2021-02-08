package internjava;
import java.util.Scanner;
public class numberofdigits {

	public static void main(String[] args) {
		System.out.println("Enter a number to find number of digits in it");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			n=n/10;
			count=count+1;
		}
     System.out.println("number of digits are "+count);
	}

}
