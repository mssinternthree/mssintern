import java.util.Scanner;

public class TernaryBig {
	public static void main(String...args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter two numbers :");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=a>b?a:b;
		System.out.println(c+" is bigger");
	}
}
