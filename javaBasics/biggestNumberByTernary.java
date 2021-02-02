import java.util.Scanner;

public class biggestNumberByTernary {

	public static void main(String[] args) {
		
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter first numbe");
				int a = scan.nextInt();
				System.out.println("Enter second number");
				int b = scan.nextInt();
				System.out.println((a>b)?a+" is bigger than "+b:(a==b)?a+" equal to "+b:b+" bigger than "+a);
			}
}
