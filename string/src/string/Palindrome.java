package string;

import java.util.Scanner;

public class Palindrome {
	static void removeCommon(String s1) {
		String str, rev = "";
		int length = s1.length();
		for (int i = length - 1; i >= 0; i--)
			rev = rev + s1.charAt(i);

		if (s1.equals(rev))
			System.out.println(s1 + " is a palindrome");
		else
			System.out.println(s1 + " is not a palindrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Strings: ");
		String name = sc.nextLine();
		removeCommon(name);
	}

}
