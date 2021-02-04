package string;
import java.util.Scanner;
public class CharecterCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		System.out.println("enter Char to check");
		char c=scan.next().charAt(0);
		int charcount=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==c) {
				charcount+=1;
			}
		}
		System.out.println("there are total  "+charcount+" "+c+"'s in string");
	}

}
