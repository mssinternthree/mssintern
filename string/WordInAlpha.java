package string;
import java.util.Arrays;
import java.util.Scanner;
public class WordInAlpha {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		String[] words=s1.split(" ");
		Arrays.sort(words);
		System.out.println("alphabetical order");
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i]+" ");
		}
		System.out.println(" ");
		System.out.println("reverse order");
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+" ");
		}
	}

}
