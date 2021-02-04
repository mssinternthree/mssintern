package string;

import java.util.Scanner;

class CompareString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		
		System.out.println("enter string");
		String s2=scan.nextLine();
		
		int flag=0;
		if(s1.length()==s2.length()) {
			for(int i=0;i<=s1.length()-1;i++) {
				if(s1.charAt(i)==s2.charAt(i)) {
					flag+=1;
				}
			}
			if(flag==s1.length()) {
				System.out.println("same");
			}else {
				System.out.println("not same");
			}
	    }else
	    	System.out.println("not same");
 }
}