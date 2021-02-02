import java.util.Scanner;
public class NEven {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a number to print evens upto that number");
		int no=in.nextInt();
		
		for(int i=0;i<=no;i=i+2) {
			System.out.println(i);
		}


	}

}
