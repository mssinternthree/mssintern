import java.util.Scanner;
public class SeriesFrac2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter number in x ");
		int x=in.nextInt();
		
		System.out.println("Enter  number in n : ");
		int n=in.nextInt();
		int fact=1;
		float sum=1;
		for(int i=1;i<=n;i++) {
			fact=1;
			for(int j=i;j>1;j--) {
				fact=fact*j;
			}
			sum=sum+ (float)Math.pow(x, i)/(float)fact;
		}
		System.out.println("Result ="+sum);


	}

}
