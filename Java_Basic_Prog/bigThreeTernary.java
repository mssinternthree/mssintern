import java.util.Scanner;
public class bigThreeTernary {

	public static void main(String[] args) {
		int a, b, c, big;
		Scanner in = new Scanner(System.in);
		System. out. println("Enter A, B and C numbers:");
		a = in. nextInt();
		b = in. nextInt();
		c = in. nextInt();
		big = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		System.out.println(big + " " + " is big one");
	
	}

}
