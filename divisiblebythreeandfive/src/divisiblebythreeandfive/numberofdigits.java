package divisiblebythreeandfive;

import java.util.Scanner;

public class numberofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;

	    while (num != 0) {
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	}

}
