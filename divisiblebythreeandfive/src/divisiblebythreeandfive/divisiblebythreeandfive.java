package divisiblebythreeandfive;

import java.util.Scanner;

public class divisiblebythreeandfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter any number to check the divisibility with 5 and 3: ");
		int number = scan.nextInt();
		if(number%3 ==0 && number%5==0) {
			System.out.println("Entered number is divisible by both 3 and 5.");
		}
		else {
			System.out.println("Entered number is not divisible by 3 and 5 both 5");
		}

	}

}
