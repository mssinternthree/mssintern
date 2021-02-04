package string;
import java.util.Scanner;
public class PrintCommonCharecters {
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
					System.out.print(wordsInOne[i]+" ");
				}
			}
			}
	}

}
