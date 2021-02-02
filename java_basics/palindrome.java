import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=sc.nextInt();
		int temp1=num;
		int r ,temp=0;
		while(num>0) {
			r=num%10;
			temp=temp*10+r;
			num=num/10;
			}
		if(temp==temp1)
		{
			System.out.println("number is palendrome");
		}
		else {
			System.out.println(" not a palendrome");
		}
	}

}
