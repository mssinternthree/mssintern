package divisiblebythreeandfive;

import java.util.Scanner;

public class nevennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i = 2,j = 1;
		System.out.println("enter number to generate even numbers : ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while(j<=num) {
			if(i%2==0) {
				System.out.println("even number"+j+"   "+i);
				j++;
			}
			i++;
		}
	}

}
