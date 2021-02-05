package string;

import java.util.Scanner;

public class Revnopredefine {

	static void stringRev(String s) {
		//String result;
		int len = s.length()-1;
		while (len >= 0) {
			System.out.print(s.charAt(len));
			len--;
		}
	}
	
	static void stringrev2(String s) {
		int len = s.length()-1,i=0;
		while (i >= len) {
			
			if(s.charAt(i)==' ') {
				
			}
			len--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		stringRev(name);
	}

}
