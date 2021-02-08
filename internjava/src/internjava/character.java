package internjava;
import java.util.Scanner;
public class character {
	public static void main(String[] args)
	{
	char cha;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter character");
	 cha = sc.next().charAt(0);
	int ch= (int) cha;
	if(ch >= 65 && ch <= 90)
	System.out.println("Upper Letter");
	else if(ch >= 97 && ch <= 122)
	System.out.println("Lower Letter");
	else if(ch >= 48 && ch <= 57)
	System.out.println("Number");
	else
	System.out.println("Symbol");
	}
	
}
