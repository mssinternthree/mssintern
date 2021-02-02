import java.util.Scanner; 

public class oddOrEven {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a;
		Scanner myObj = new Scanner(System.in);
		System.out.println("enter number to check whether it is even or odd");
		a = myObj.nextInt();
		if(a%2==0) {
			System.out.println(a+" is even");
		}
		else {
			System.out.println(a+" is odd");
		}

	}

}
