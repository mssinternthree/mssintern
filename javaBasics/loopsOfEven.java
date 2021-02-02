import java.util.Scanner;

public class loopsOfEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter n to find n eves");
		 int n=scan.nextInt();
		 int i2 = 0,i3=1;
		System.out.println("enter n to find n eves using for");
		for(int i1=1;i1<=n*2;i1++) {
			if(i1%2==0) {
				System.out.println(i1);
			}
		}
		System.out.println("enter n to find n eves using do while");
		do{
			if(i2%2==0) {
				System.out.println(i2);
			}
			i2++;
		}while( i2<=n*2);
		System.out.println("enter n to find n eves using while");
		while(i3<=n*2) {
			if(i3%2==0) {
				System.out.println(i3);
			}
			i3++;
		}
		
		
	}

}
