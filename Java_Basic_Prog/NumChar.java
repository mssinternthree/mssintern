import java.util.Scanner;
public class NumChar
{
	public static void main(String[] args)
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		ch = sc.next().charAt(0);
		if(ch >= 65 && ch <= 90)
			System.out.println("Upper Letter");
		else if(ch >= 97 && ch <= 122)
			System.out.println("Lower Letter");
		else if(ch >= 48 && ch <= 57)
			System.out.println("Number");
		else
			System.out.println("Symbol");
		System.out.println("\\/");
	}
}