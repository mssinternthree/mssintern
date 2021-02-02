import java.util.Scanner;

public class xAxisOrYaxis {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter X-coordinate");
		float x =scan.nextFloat();
		System.out.println("enter y-coordinate");
		float y =scan.nextFloat();
		if(x==0&&y==0) {
			System.out.println("stays on Origin");
		}else {
			System.out.println("stays on axis");
		}
	}

}