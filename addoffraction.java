 package mssintern;

import java.util.Scanner;

public class addoffraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to find upto that number ");
		float n=scan.nextFloat();
		float sum=0;
		for(float i=1;i<n;i++) {
			sum+=1/i;
				
			
		}
		System.out.println(sum);
	}

}
