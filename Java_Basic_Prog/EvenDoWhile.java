import java.util.Scanner;
public class EvenDoWhile {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int n=in.nextInt();
		
		int i=0;
		do{
			System.out.printf("%d ",i);
			i=i+2;
		}while(i<=n);


	}

}
