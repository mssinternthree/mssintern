import java.util.Scanner;
public class ternaryop{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		 int a = (num1>num2)?num1:num2;
		System.out.println(a); 
		
	}

}
