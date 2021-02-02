package divisiblebythreeandfive;

import java.util.Scanner;

public class ternary3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a, b, c, d;

        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

        System.out.println("Enter all three numbers:");

        a = s.nextInt();

        b = s.nextInt();

        c = s.nextInt();

        d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);

        System.out.println("Largest Number:"+d);
	}

}
