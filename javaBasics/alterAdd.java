import java.util.Scanner;
public class alterAdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter n to find sum upto n");
		 int n=scan.nextInt();
		 int sum=0;
		 
		for(int i=1;i<=n;i++) {
			if(i%2==0)
			sum+=i;
		}
		System.out.println(sum);

	}

}
