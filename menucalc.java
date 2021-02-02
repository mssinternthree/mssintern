package mssintern;

import java.util.Scanner;

public class menucalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scan=new Scanner(System.in);
	 System.out.println("enter first value");
	   a=scan.nextInt();
	 System.out.println("enter seond value");
	   b=scan.nextInt();
	 System.out.println("choose the option\n1)sub\n2)mul\n3)add\n4)div");
	 	int choice=scan.nextInt();
	 	switch(choice) {
	 	case 1:
	 		 System.out.println(a-b);
	 		 break;
	 	case 2:
	 		  System.out.println(a*b);
	 		  break;
	 	case 3:
	 		System.out.println(a+b);
	 		  break;
	 	case 4:
	 		System.out.println(a/b);
	 		 break;
	 	default:
	 		System.out.println("choose the proper option");
	 		
	
	 	}
	}

}
