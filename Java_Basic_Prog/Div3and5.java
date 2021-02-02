import java.util.Scanner;
public class Div3and5 {
	
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number to check the is divisible by 3 or 5 or not");
		n = in.nextInt();
		if(n%3==0 && n%5 == 0) {
			System.out.println("The Given Number is divisible by both 3 and 5");
		}
		else {
			System.out.println("!!The Given Number is not divisible by 3 and 5");
		}
		
	}

}
