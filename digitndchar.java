package mssintern;

import java.util.Scanner;

public class digitndchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	System.out.println("enter char");
	char c=scan.nextLine().toCharArray()[0];
	System.out.println("enter digit");
	int i=scan.nextInt();
	System.out.println(c+"is a character");
	System.out.println(i+"is a digi");
	}

}
