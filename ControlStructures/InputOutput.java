import java.util.Scanner;

public class InputOutput {
	public static void main(String...args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int yourSalary=in.nextInt();
		
		System.out.println("Enter your First initial : ");
		char yourFirstInitital=in.next().charAt(0);
		
		System.out.println("Your Salary :"+yourSalary);
		System.out.println("Your First Initial :"+yourFirstInitital);
	}
}
