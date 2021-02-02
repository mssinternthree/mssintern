package mssintern;

import java.util.Scanner;

public class addfirstandlastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number to add first and last digit of that number ");
		int n= scan.nextInt();
		int temp=0;
		int las=n%10;
		while(n!=0) {
			temp=temp*10+(n%10);
			n=n/10;
		}
		int f=temp%10;
		System.out.println(f+las);


	}

}
