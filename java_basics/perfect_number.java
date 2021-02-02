import java.util.Scanner;
public class perfect_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=0;
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				fact=fact+i;
			}
		}
			if(n == fact) {
				System.out.println("perfect number");
			}
		}
	}


