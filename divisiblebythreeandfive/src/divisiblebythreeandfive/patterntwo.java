package divisiblebythreeandfive;

import java.util.Scanner;

public class patterntwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Enter total number of rows : ");
		int r = in.nextInt();

		for (int i = 0; i < r; i++) {
			System.out.printf("\n");
			for (int j = 1; j <= r - i; j++) {
				System.out.printf(" ");
			}
			if (i == 0) {
				System.out.printf("%d ", i + 1);
			} else {
				for (int j = i + 1; j >= 1; j--) {
					System.out.printf("%d", j);
				}
				for (int j = 2; j <= i + 1; j++) {
					System.out.printf("%d", j);
				}
			}
		}
	}

}
