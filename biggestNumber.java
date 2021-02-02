import java.util.Scanner;

public class biggestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Character");
		int a = scan.nextInt();
		System.out.println("Enter second");
		int b = scan.nextInt();
		if(a>b) {
			System.out.println(a+" is bigger than "+b);
		}
		else if(a<b) {
			System.out.println(b+" is bigger than "+a);
		}
		else {
			System.out.println(a+" is equal to"+a);
		}
	}

}
