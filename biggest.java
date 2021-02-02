package mssintern;

import java.util.Scanner;

public class biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number 1:");
	     num1=scan.nextInt();
	      System.out.println("enter number 2");
	      num2=scan.nextInt();
	      if( num1<num2) {
	          System.out.println(num1+" is the smallest Number");
	      }
	      else if (num2 >num1) {
	          System.out.println(num2+" is the largest Number");
	      }
	      else
	          System.out.println("they are equal");
	}

}
