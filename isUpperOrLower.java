import java.util.Scanner;

public class isUpperOrLower {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Character");
		char c = scan.nextLine().toCharArray()[0];
		if(c>='A'&& c<='Z') {
			System.out.println("Upper");
		}else if(c>='a'&& c<='z') {
			System.out.println("Lower");
		}else if(c>='0'&& c<='9') {
			System.out.println("digit");
		}else {
			System.out.println("Special");
		}
	}

}
