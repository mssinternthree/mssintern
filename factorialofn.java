package mssintern;

import java.util.Scanner;

public class factorialofn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter number to find factorial");
		 int n=scan.nextInt();
		 int fact=1;
		
		for(int i=1;i<=n;i++) {
		  fact=fact*i;
		}
		System.out.println(" factorial is "+ fact);

	}

}
