import java.util.Scanner;

public class TernaryThree {
	public static void main(String...args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter three numbers :");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int d=a>b ? a>c?a:c : b>c?b:c;
		System.out.println(d+" is bigger.");
	}
}
