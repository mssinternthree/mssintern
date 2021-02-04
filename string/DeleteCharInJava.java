package string;

import java.util.Scanner;

public class DeleteCharInJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		System.out.println("enter Char to remove");
		char c=scan.next().charAt(0);
		String s2 = s1.replaceAll(Character.toString(c)," ");
		System.out.println(s2);
	}

}
