package divisiblebythreeandfive;

import java.util.Scanner;

public class squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i = 0;
		System.out.println("enter number to generate squares: ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while(i<=num) {
			System.out.println(i+" square = "+i*i);
			i++;
		}
	}

}
