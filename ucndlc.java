package mssintern;

import java.util.Scanner;

public class ucndlc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cases;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter charcter");
		char l=scan.nextLine().toCharArray()[0];
			if((l>='a')&&(l<='z'))
					{
					  System.out.println("lowercase");
					}
			else if((l>='A')&&(l<='Z'))
					{
					  System.out.println("UPPERCASE");
					 }
			else if((l>='1')&&(l<='9'))
					{
					  System.out.println("digit");
					}
			else
					{
					  System.out.println("special");
					}
					}

					
	
}
