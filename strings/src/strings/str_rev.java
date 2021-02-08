package strings;
import java.util.Scanner;
public class str_rev {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		char a[]=str.toCharArray();
		System.out.println("reverse string");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(a[i]);

		}

	}

}
