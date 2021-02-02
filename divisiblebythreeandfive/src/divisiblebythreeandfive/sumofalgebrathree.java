package divisiblebythreeandfive;

import java.util.Scanner;

public class sumofalgebrathree {
	public static void main(String... args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Enter n : ");
		int no = in.nextInt();

		float sum = 0;
		for (int i = 0; i <= no - 1; i++) {
			sum = sum + (float) 1 / (float) Math.pow(2, i);
		}
		System.out.println("Result :" + sum);
	}
}
