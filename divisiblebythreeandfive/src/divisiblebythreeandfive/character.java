package divisiblebythreeandfive;

import java.util.Scanner;

public class character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter Character :");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		if(ch >= 65 && ch <= 90)
			System.out.println("upper");
		else if(ch >= 97 && ch <= 122)
			System.out.println("lower");
		else if(ch >= 48 && ch <= 57)
			System.out.println("number");
		else
			System.out.println("symbol");

	}

}
