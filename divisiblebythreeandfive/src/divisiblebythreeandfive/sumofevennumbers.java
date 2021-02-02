package divisiblebythreeandfive;

import java.util.Scanner;

public class sumofevennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i = 2,j = 1,sum = 0;
		System.out.println("enter number to generate sum of even numbers: ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while(j<=num) {
			if(i%2==0) {
				System.out.println("even number "+j+"   "+i);
				sum = sum + i;
				j++;
			}
			i++;
		}
		System.out.println("Sum is "+ sum);
	}

}
