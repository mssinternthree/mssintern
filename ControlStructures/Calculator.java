import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter two numbers :");
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println("Enter your Choice : 1. Addition 2. Subtraction 3. Multiplication 4. Division ");
		int ch=in.nextInt();
		
		switch(ch) {
			case 1: System.out.println("Addition : "+ (a+b));
					break;
			case 2: System.out.println("Substraction : "+ (a-b));
					break;
			case 3:	System.out.println("Multipliication : "+ (a*b));
				 	break;
			case 4:	System.out.println("Division : "+ (a/b));
					break;
			default:
					System.out.println("Wrong Choice Entered");
		}
	}

}
