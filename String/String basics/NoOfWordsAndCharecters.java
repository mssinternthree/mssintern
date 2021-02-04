package string;

import java.util.Scanner;

public class NoOfWordsAndCharecters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		int words=0,cha=0,vowels=0,constan=0;
		for(int i=0;i<s1.length();i++) {
			if(Character.isWhitespace(s1.charAt(i)))
			{
				words+=1;
				if(s1.charAt(i+1)=='a'||s1.charAt(i+1)=='e'||s1.charAt(i+1)=='i'||s1.charAt(i+1)=='o'||s1.charAt(i+1)=='u'){
					vowels+=1;
			}else 
				constan+=1;
			}else
				cha+=1;
		}
		System.out.println("words: "+(words+1)+" charecters: "+cha+" vowels: "+vowels+" coonstants: "+constan);
	}

}
