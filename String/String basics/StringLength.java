package string;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		String s2 =s1.concat("\0");
		int i=1,len=0;
		
		while(s2.charAt(i)!='\0') {
			if(Character.isWhitespace(s2.charAt(i)))
			{	i++;
				continue;
			}else {
				len+=1;
				i++;
			}
		}
		System.out.print(len+1);
	}

}
