package string;

import java.util.Scanner;

public class RevOrderWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		String[] s2=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			/*for(int i=s1.length()-1;i>=0;i--) {
				System.out.printf("%c",s1.charAt(i));
			}*/
			for(int j=s2[i].length()-1;j>=0;j--) {
				
				System.out.print(s2[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
