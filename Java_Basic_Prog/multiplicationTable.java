import java.util.Scanner;
public class multiplicationTable {

	public static void main(String[] args) {
		
		
		int  n ;
		System.out.println("Enter a number to print table upto 10 steps:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n +" * "+ i+" = "+(n*i));
		}
		
	}

}
