package string;

import java.util.Scanner;

public class Removespecial {
	public static void main(String... args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Enter your string : ");
		String stringInput = in.nextLine();

		String replacedString = stringInput.replaceAll("[^0-9A-Za-z]", "");
		System.out.println("String without special charaters : " + replacedString);
	}
}
