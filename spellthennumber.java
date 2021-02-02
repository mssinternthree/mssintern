package mssintern;

import java.util.Scanner;

public class spellthennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number to find the spelling");
		int n = scan.nextInt();
		String[] words= {" zero "," one "," two "," three "," four "," five "," six "," seven "," eight "," nine "};
		int rev=0;
		while(n>0) {
	     	rev=rev*10+(n%10);
	     	n=n/10;
		}
		while(rev>0) {
	     	System.out.printf("%s",words[rev%10]);
	     	rev=rev/10;

		}
	}

}
