package mssintern;

import java.util.Scanner;

public class ternarybiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter the first number:");  
		a = scan.nextInt();  
		System.out.println("Enter the second number:");  
		b = scan.nextInt();  
		System.out.println("Enter the third number:");  
		c = scan.nextInt(); 
		
		System.out.println((a>b&&a>c)?a+" is  bigger than "+b+" and "+c:
		      (a<b&&c<b)?b+" bigger than "+a+"and "+c:
		      (a<c&&b<c)?c+" bigger than "+a+" and "+b:
                            "ALL ARE EQUAL");

	}

}
