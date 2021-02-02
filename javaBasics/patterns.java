import java.util.Scanner;

public class patterns {

	public static void main(String[] args) {
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of rows you  want to enter");
		int n= scan.nextInt();
		for(int i=0;i<n;i++) {
			System.out.printf("\n");
			for(int j=1;j<=n;j++) {
				System.out.printf(" ");
				if(i==0) {
					System.out.printf("%d",i+1);
				}else {
					for(int j1=i+1;j1>=1;j1--) {
						System.out.printf("%d",j1);
					}
					for(int j1=2;j1<=1;j1++) {
						System.out.printf("%d",j1);
					}
				}
			}
		}
	

	}

}
