import java.util.Scanner;

public class DivThreeFive {
	public static void main(String...args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no=in.nextInt();
		
		if(no%3==0 && no%5==0) {
			System.out.println(no+" is Divisible by 3 and 5");
		}else {
			System.out.println(no+" is not Divisible by 3 and 5");
		}
	}
}
