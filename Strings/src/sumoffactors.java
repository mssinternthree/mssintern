

import java.util.Scanner;
public class sumoffactors {
	public static void main(String[] args) {
		Scanner fact = new Scanner(System.in);
		System.out.println("Enter number to find whether it is perfect or not:");
		int n=fact.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			System.out.println(n+" is perfect");
		else
			System.out.println(n+" is not perfect number");
	}
}
