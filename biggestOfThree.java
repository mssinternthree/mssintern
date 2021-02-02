import java.util.Scanner;

public class biggestOfThree {

	public static void main(String[] args) {
	
				
						Scanner scan = new Scanner(System.in);
						System.out.println("Enter first number");
						int a = scan.nextInt();
						System.out.println("Enter second number");
						int b = scan.nextInt();
						System.out.println("Enter thrid number");
						int c = scan.nextInt();
						System.out.println((a>b&&a>c)?a+" is bigger than "+b+" and "+c:
										   (a<b&&c<b)?b+" bigger than "+a+"and "+c:
										   (a<c&&b<c)?c+" bigger than "+a+" and "+b:"ALL ARE EQUAL");
					}
	

}
