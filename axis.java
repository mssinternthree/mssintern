package mssintern;

import java.util.Scanner;

public class axis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter x axis coordinate:");
		float x=scan.nextFloat();
		System.out.println("enter y axis coordinate:");
		float y=scan.nextFloat();
		
		 if(x==0&&y==0)
		 {
			 System.out.println("coordinates are on origin");
			 
		 }
		 else
		 {
			 System.out.println("coordinates are on axis");
		 }
		 
	}
	

}
