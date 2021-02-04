package string;
import java.util.Arrays;
import java.util.Scanner;
public class WordInAlpha {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.nextLine();
		char[] cha= s1.toCharArray();
		Arrays.sort(cha);
		System.out.println("alphabetical order");
		for(int i=0;i<cha.length;i++) {
			if(cha[i]!=' ')
			System.out.print(cha[i]+" ");
		}
		
	}

}
