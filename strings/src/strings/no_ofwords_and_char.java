package strings;
import java.util.Scanner;
public class no_ofwords_and_char {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter string");
		String a=sc.nextLine();
		
		System.out.println(a.length());
		int count=1;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==' ') {
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
