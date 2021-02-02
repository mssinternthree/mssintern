import java.util.Scanner;
public class compareNumTernary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a , b , big;
		 System.out.println("Enter A and B values to find which is big");
		 a = in.nextInt();
		 b = in.nextInt();
	    big = (a > b) ? a : b; 
	    System.out.println(big + " " + " is big one");

	}

}
