package mssintern;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 System.out.println("enter a number for the multiplication");
		 int num=scan.nextInt();
		 System.out.println("you want upto the");
		 int limit=scan.nextInt();
		 for(int i=1;i<=limit;i++)
		 {
			 System.out.println(num+"x"+i+"="+num*i);
		 }
		 
	}

}
