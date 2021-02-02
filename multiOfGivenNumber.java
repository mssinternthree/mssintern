import java.util.Scanner;
public class multiOfGivenNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter which table  you want ");
		int num = scan.nextInt();
		System.out.println("up to how many");
		int limit = scan.nextInt();
		for(int i=1;i<=limit;i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
}
