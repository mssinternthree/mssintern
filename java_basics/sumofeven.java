
import java.util.Scanner;
public class sumofeven{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0)
			{
				count=count+i;
			}
			
		}
		System.out.println(count);

	}

}
