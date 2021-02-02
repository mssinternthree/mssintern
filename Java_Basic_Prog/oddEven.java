import java.util.Scanner;
public class oddEven {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number to find Odd or Even\n");
		int n = in.nextInt();
		if(n%2==0) {
			System.out.println(n + " " + "Is a even Number \n");
		}else {
			System.out.println(n + " " + "is odd Number");
		}
	}
}
