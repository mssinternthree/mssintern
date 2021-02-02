package mssintern;

import java.util.Scanner;

public class allevens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 System.out.println("enter a number to find sum of evens");
		 int n=scan.nextInt();
		 int sum=0;
		 for(int i=1;i<=n;i++) {
		if(i%2==0)
		sum+=i;	 
		 }
		 System.out.println(sum);
		 
	}

}
