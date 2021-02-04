package string;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		String[] s2=s1.split(" ");
		String s3 = "";
		for(int i=s2.length-1;i>=0;i--) {
			
			s3=s3+s2[i]+" ";
		}
		
		System.out.println(s3);
		String s4=String.join(" ",s2);
		s4=s4+" ";
	
		int check=s3.compareTo(s4);
		
		if(check==0) {
			System.out.print("palindrome");
		}
		
	}

}
