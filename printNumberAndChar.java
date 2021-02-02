import java.util.Scanner;
public class printNumberAndChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Character");
		char c = scan.nextLine().toCharArray()[0];
		System.out.println("Enter number");
		int i = scan.nextInt();
		System.out.println(c+"is charecter");
		System.out.println(i+"is number");
	}
}
