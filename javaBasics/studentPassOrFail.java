import java.util.Scanner;

public class studentPassOrFail {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter maths marks");
		int maths=scan.nextInt();
		System.out.println("enter social marks");
		int social = scan.nextInt();
		System.out.println("enter physics marks");
		int physics = scan.nextInt();
		if(maths>34 && social > 34 && physics >34) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}

	}

}
