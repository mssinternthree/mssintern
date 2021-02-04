package string;

import java.util.Scanner;

public class RmCommonCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string one");
		String s1=scan.nextLine();
		System.out.println("enter string two");
		String s2=scan.nextLine();
		char[] wordsInOne=s1.toCharArray();
		char[] wordsInTwo=s2.toCharArray();
		for(int i=0;i<wordsInOne.length;i++) {
			for(int j=0;j<wordsInTwo.length;j++) {
				if(wordsInOne[i]==wordsInTwo[j]) {
					wordsInOne[i]=' ';
					wordsInTwo[i]=' ';
				}
			}
		}
		s1=new String(wordsInOne);
		System.out.println(s1);
		s2=new String(wordsInTwo);
		System.out.println(s2);
	}

}
