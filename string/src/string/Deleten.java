package string;

import java.util.Scanner;

public class Deleten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = "Hello my name is surya";
		String result = null;
		System.out.printf("Actual string:" + name + "\n");
		System.out.printf("Enter how many characters you want to delete:");
		int num = sc.nextInt();
		if (num > name.length()) {
			System.out.printf("Not possible out of range! \n");
		} else {
			result = name.substring(num, name.length());
		}
		System.out.printf("Result is = "+ result);
	}

}
