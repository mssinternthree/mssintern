import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		System.out.println("Enter a Number:");
		int no=in.nextInt();
		
		if(no%2==0) {
			System.out.println(no+" is Even");
		}else {
			System.out.println(no+" is Odd");
		}
	}

}
