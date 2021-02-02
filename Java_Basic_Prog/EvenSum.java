import java.util.Scanner;
public class EvenSum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter a number to sum of evens upto this Number");
		int n=in.nextInt();
		
		for(int i=0;i<=n;i=i+2) {
			sum=sum+i;
		}
		System.out.println("Sum of even numbers is = "+sum);


	}

}
