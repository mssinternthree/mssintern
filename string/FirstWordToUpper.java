package string;

import java.util.Scanner;

public class FirstWordToUpper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		String[] words=s1.split(" ");
		for(int i=0;i<=words.length-1;i++) {
			String f=words[i].substring(0,1).toUpperCase();
			String r=words[i].substring(1,words[i].length());
			System.out.print(f+r +" ");
		}
	}

}
