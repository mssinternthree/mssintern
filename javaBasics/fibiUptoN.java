import java.util.Scanner;
public class fibiUptoN {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n ");
int n = scan.nextInt();
		System.out.printf(a+" "+b+" ");
		for(int i=0;i<n-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.printf("%d ",c);
		}
	}
}
