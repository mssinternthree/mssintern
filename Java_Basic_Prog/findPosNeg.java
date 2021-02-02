import java.util.Scanner;
public class findPosNeg {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("Enter a value to check whether the number is Positive or Negative");
		n = in.nextInt();
		System.out.print(n);
		if(n<0) {
			System.out.print("The given Number is Negative");
		}else {
			System.out.print("The given Number is Positive");
		}
		
}
}
