package mssintern;

import java.util.Scanner;

public class dowhilemultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number that you want a  multiplication table");
		int num = scan.nextInt();
		System.out.println("upto");
		int limit = scan.nextInt();
		int i=1;
		do{
			System.out.println(num+" x "+i+" = "+num*i);
			i++;
		}while(i<=limit);


	}

}
