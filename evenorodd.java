package mssintern;

import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("enter a number to check  even or odd");
		Scanner	input=new Scanner(System.in);
		num=input.nextInt();
		if(num%2 ==0)
		{
			System.out.println("even number");
			
		}
		else
		System.out.println("odd number");
	}

	}
