package divisiblebythreeandfive;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number to generate table:");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		 int num =s.nextInt();
	        for(int i = 1; i <= 10; ++i)
	        {
	            System.out.printf("%d * %d = %d \n", num, i, num * i);
	        }
	}

}
