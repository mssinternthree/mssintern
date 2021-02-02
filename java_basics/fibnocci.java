import java.util.Scanner;
public class fibnocci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		int i=0;
		int j=1;
		int n=1;
		System.out.println(i);
		System.out.println(j);
		while( n<=num-2) {
			int k=i+j;
			System.out.println(k);
			i=j;
			j=k;
			n++;
		}
	
	}

}
