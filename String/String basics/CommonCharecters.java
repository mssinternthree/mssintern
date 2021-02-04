package string;
import java.util.Scanner;
public class CommonCharecters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string one");
		String s1=scan.nextLine();
		System.out.println("enter string two");
		String s2=scan.nextLine();
		String s3 = "";
		char[] wordsInOne=s1.toCharArray();
		char[] wordsInTwo=s2.toCharArray();
		for(int i=0;i<wordsInOne.length;i++) {
			for(int j=0;j<wordsInTwo.length;j++) {
				if(wordsInOne[i]==wordsInTwo[j]) {
					if (s3.indexOf(wordsInOne[i]) == -1) {
					    s3=s3+wordsInOne[i]+" ";
					}
				}
			}
		}
		System.out.println(s3 + " are common characters in both Strings");

	}

}
