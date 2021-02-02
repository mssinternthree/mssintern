package divisiblebythreeandfive;

import java.util.Scanner;

public class biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number one : ");
		int num1 = scan.nextInt();
		System.out.print("Enter number two : ");
		int num2 = scan.nextInt();
		if(num1>num2) {
			System.out.println("Number one is bigger then two:");
		}
		else {
			System.out.println("Number two is bigger then one:");
		}
	}

}
